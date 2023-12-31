/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author edson
 */
import conexao.ConexaoPostgres; // Substitua pelo seu gerenciador de conexão
import enums.TipoCliente;
import enums.TipoEmpresa;
import model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Log;
import model.UsuarioLogado;
import service.LogService;

public class ClienteDAO {

    private Connection conexao;

    public ClienteDAO() throws SQLException {
//        conexao = ConexaoPostgres.obterConexao(); // Substitua pela sua maneira de obter uma conexão

    }

    public boolean adicionarCliente(Cliente cliente) {
        try {//
            conexao = ConexaoPostgres.obterConexao();
            String sql = "INSERT INTO cliente (tipo_cliente, cnpj, razao_social, nome_fantasia, "
                    + "inscricao_estadual, inscricao_municipal, endereco, contato, "
                    + "responsavel_legal, tipo_empresa, ativo"
                    + ",cep, complemento, bairro, cidade) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?)";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, cliente.getTipoCliente().getId());
            preparedStatement.setString(2, cliente.getCnpj());
            preparedStatement.setString(3, cliente.getRazaoSocial());
            preparedStatement.setString(4, cliente.getNomeFantasia());
            preparedStatement.setString(5, cliente.getInscricaoEstadual());
            preparedStatement.setString(6, cliente.getInscricaoMunicipal());
            preparedStatement.setString(7, cliente.getEndereco());
            preparedStatement.setString(8, cliente.getContato());
            preparedStatement.setString(9, cliente.getResponsavelLegal());
            preparedStatement.setInt(10, cliente.getTipoEmpresa().getId());
            preparedStatement.setBoolean(11, cliente.isAtivo());

            preparedStatement.setString(12, cliente.getCep());
            preparedStatement.setString(13, cliente.getComplemento());
            preparedStatement.setString(14, cliente.getBairro());
            preparedStatement.setString(15, cliente.getCidade());

            preparedStatement.executeUpdate();

            //salvando log
            LogService.salvarLog(new Log(
                    UsuarioLogado.getUsuarioLogado().getId(),
                    "Cliente",
                    Log.EventoLog.CRIAR,
                    false));
            conexao.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizarCliente(Cliente cliente) {
        try {
            conexao = ConexaoPostgres.obterConexao();
            String sql = "UPDATE cliente SET tipo_cliente = ?, cnpj = ?, razao_social = ?, "
                    + "nome_fantasia = ?, inscricao_estadual = ?, inscricao_municipal = ?, "
                    + "endereco = ?, contato = ?, responsavel_legal = ?, "
                    + "tipo_empresa = ? , ativo = ?,cep=?, complemento=?, bairro=?, cidade=? WHERE id = ?";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, cliente.getTipoCliente().getId());
            preparedStatement.setString(2, cliente.getCnpj());
            preparedStatement.setString(3, cliente.getRazaoSocial());
            preparedStatement.setString(4, cliente.getNomeFantasia());
            preparedStatement.setString(5, cliente.getInscricaoEstadual());
            preparedStatement.setString(6, cliente.getInscricaoMunicipal());
            preparedStatement.setString(7, cliente.getEndereco());
            preparedStatement.setString(8, cliente.getContato());
            preparedStatement.setString(9, cliente.getResponsavelLegal());
            preparedStatement.setInt(10, cliente.getTipoEmpresa().getId());
            preparedStatement.setBoolean(11, cliente.isAtivo());

            preparedStatement.setString(12, cliente.getCep());
            preparedStatement.setString(13, cliente.getComplemento());
            preparedStatement.setString(14, cliente.getBairro());
            preparedStatement.setString(15, cliente.getCidade());

            preparedStatement.setInt(16, cliente.getId());
            preparedStatement.executeUpdate();

            //salvando log
            LogService.salvarLog(new Log(
                    UsuarioLogado.getUsuarioLogado().getId(),
                    "Cliente",
                    Log.EventoLog.ALTERAR,
                    false));
            conexao.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void excluirCliente(int id) {
        try {
            conexao = ConexaoPostgres.obterConexao();
            String sql = "DELETE FROM cliente WHERE id = ?";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> listarClientes() {

        List<Cliente> clientes = new ArrayList<>();
        try {
            conexao = ConexaoPostgres.obterConexao();
            String sql = "SELECT id, tipo_cliente, cnpj, razao_social, nome_fantasia, "
                    + "inscricao_estadual, inscricao_municipal, endereco, contato, "
                    + "responsavel_legal, tipo_empresa "
                    + ",cep, complemento, bairro, cidade "
                    + "FROM cliente WHERE deletado = false ORDER BY id ASC";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                TipoCliente tipoCliente = TipoCliente.getById(resultSet.getInt("tipo_cliente"));
                String cnpj = resultSet.getString("cnpj");
                String razaoSocial = resultSet.getString("razao_social");
                String nomeFantasia = resultSet.getString("nome_fantasia");
                String inscricaoEstadual = resultSet.getString("inscricao_estadual");
                String inscricaoMunicipal = resultSet.getString("inscricao_municipal");
                String endereco = resultSet.getString("endereco");
                String contato = resultSet.getString("contato");
                String responsavelLegal = resultSet.getString("responsavel_legal");
                TipoEmpresa tipoEmpresa = TipoEmpresa.getById(resultSet.getInt("tipo_empresa"));

                String cep = resultSet.getString("cep");
                String complemento = resultSet.getString("complemento");
                String bairro = resultSet.getString("bairro");
                String cidade = resultSet.getString("cidade");

                Cliente cliente = new Cliente(id, tipoCliente, cnpj, razaoSocial, nomeFantasia,
                        inscricaoEstadual, inscricaoMunicipal, endereco, contato, responsavelLegal, tipoEmpresa, cep, complemento, bairro, cidade);

                clientes.add(cliente);
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public Cliente obterClientePorId(int id) {

        Cliente cliente = null;
        try {
            conexao = ConexaoPostgres.obterConexao();
//            Connection conn = ConexaoPostgres.obterConexao();
            String sql = "SELECT tipo_cliente, cnpj, razao_social, nome_fantasia, "
                    + "inscricao_estadual, inscricao_municipal, endereco, contato, "
                    + "responsavel_legal, tipo_empresa, deletado,ativo "
                    + ",cep, complemento, bairro, cidade "
                    + "FROM cliente WHERE id = ?";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                TipoCliente tipoCliente = TipoCliente.getById(resultSet.getInt("tipo_cliente"));
                String cnpj = resultSet.getString("cnpj");
                String razaoSocial = resultSet.getString("razao_social");
                String nomeFantasia = resultSet.getString("nome_fantasia");
                String inscricaoEstadual = resultSet.getString("inscricao_estadual");
                String inscricaoMunicipal = resultSet.getString("inscricao_municipal");
                String endereco = resultSet.getString("endereco");
                String contato = resultSet.getString("contato");
                String responsavelLegal = resultSet.getString("responsavel_legal");
                TipoEmpresa tipoEmpresa = TipoEmpresa.getById(resultSet.getInt("tipo_empresa"));
                boolean deletado = resultSet.getBoolean("deletado");
                boolean ativo = resultSet.getBoolean("ativo");
                
                 String cep = resultSet.getString("cep");
                String complemento = resultSet.getString("complemento");
                String bairro = resultSet.getString("bairro");
                String cidade = resultSet.getString("cidade"); 
                cliente = new Cliente(id, tipoCliente, cnpj, razaoSocial, nomeFantasia,
                        inscricaoEstadual, inscricaoMunicipal, endereco, contato, responsavelLegal, tipoEmpresa, ativo,cep,complemento,bairro,cidade);
                preparedStatement.close();
                resultSet.close();
                conexao.close();
                ConexaoPostgres.fecharConexao(conexao);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cliente;
    }

    public void marcarClienteComoDeletado(int id) {
        try {
            conexao = ConexaoPostgres.obterConexao();
            String sql = "UPDATE cliente SET deletado = true WHERE id = ?";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            //salvando log
            LogService.salvarLog(new Log(
                    UsuarioLogado.getUsuarioLogado().getId(),
                    "Cliente",
                    Log.EventoLog.DELETAR,
                    true));
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
