import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramiro
 */
public class ClientesControl {
   
    PreparedStatement pstm;
    ResultSet rs;
    
    String consultaRegistro = "select * from clientes where nome like ? order by nome";
    
    String gravaCliente = "insert into clientes (id, data_cadastro, nome, sexo, email, telefone, celular, uf, cidade, cep, empresa, fax) "
            + "values (?,?,?,?,?,?,?,?,?,?,?,?)";
    
    String alteraCliente = "update clientes set nome=?, sexo=?, email=?, telefone=?, celular=?, uf=?, cidade=?, cep=?, empresa=?, fax=? "
            + "where id = ?";
    
    public List<ClientesBean> listarClientes(String nome) {
        List<ClientesBean> clientes = new ArrayList();
        ConexaoBD con = new ConexaoBD();
        try {            
            pstm = con.conecta().prepareStatement(consultaRegistro);
            pstm.setString(1, nome);
            rs = pstm.executeQuery(); 
            ClientesBean cb;
            while (rs.next()) {
                cb = new ClientesBean();
                cb.setId_cliente(rs.getInt("id"));
                cb.setData_cadastro(rs.getDate("data_cadastro")); 
                cb.setNome(rs.getString("nome"));                               
                cb.setSexo(rs.getString("sexo"));
                cb.setEmail(rs.getString("email"));
                cb.setTelefone(rs.getString("telefone"));
                cb.setCelular(rs.getString("celular"));
                cb.setEstado(rs.getString("uf"));                
                cb.setCidade(rs.getString("cidade"));
                cb.setCep(rs.getString("cep"));
                cb.setEmpresa(rs.getString("empresa"));
                cb.setFax(rs.getString("fax"));
                clientes.add(cb);                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Existe Registro!");
            e.printStackTrace();
        } finally{
            con.desconecta();
        }
        return clientes;
    }    
    
    public void gravarCliente(ClientesBean cb) {
        ConexaoBD con = new ConexaoBD();
        try {
            pstm = con.conecta().prepareStatement(gravaCliente);
            pstm.setInt(1, cb.getId_cliente());
            pstm.setDate(2, cb.getData_cadastro());
            pstm.setString(3, cb.getNome());            
            pstm.setString(4, cb.getSexo());
            pstm.setString(5, cb.getEmail());
            pstm.setString(6, cb.getTelefone());
            pstm.setString(7, cb.getCelular());            
            pstm.setString(8, cb.getEstado());
            pstm.setString(9, cb.getCidade());
            pstm.setString(10, cb.getCep());
            pstm.setString(11, cb.getEmpresa());
            pstm.setString(12, cb.getFax());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Gravado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Gravar o Registro!");
            e.printStackTrace();
        } finally{
            con.desconecta();
        }
    }    
    
    public void alterarCliente(ClientesBean cb) {
        ConexaoBD con = new ConexaoBD();
        try {
            pstm = con.conecta().prepareStatement(alteraCliente);            
            pstm.setString(1, cb.getNome());            
            pstm.setString(2, cb.getSexo());
            pstm.setString(3, cb.getEmail());
            pstm.setString(4, cb.getTelefone());
            pstm.setString(5, cb.getCelular());            
            pstm.setString(6, cb.getEstado());
            pstm.setString(7, cb.getCidade());
            pstm.setString(8, cb.getCep());
            pstm.setString(9, cb.getEmpresa());
            pstm.setString(10, cb.getFax());
            pstm.setInt(11, cb.getId_cliente());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Alterado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Alterar o Registro!");
            e.printStackTrace();
        } finally{
            con.desconecta();
        }
    }
    
    String consultaLicenca = "select * from licencas where codcliente = ?";
    
    String gravaLicenca = "insert into licencas (id, codcliente, software, licenca, data_ativacao, codativacao, flg_reativacao, motivo) "
            + "values (?,?,?,?,?,?,?,?)";
    
    String alteraLicenca = "update licencas set software=?, licenca=?, data_ativacao=?, codativacao=?, flg_reativacao=?, motivo=? "
            + "where id = ?";
    
    public List<ClientesBean> listarLicencas(Integer codcliente) {
        List<ClientesBean> licencas = new ArrayList();
        ConexaoBD con = new ConexaoBD();
        try {            
            pstm = con.conecta().prepareStatement(consultaLicenca);
            pstm.setInt(1, codcliente);
            rs = pstm.executeQuery(); 
            ClientesBean cb;
            while (rs.next()) {
                cb = new ClientesBean();
                cb.setId_licenca(rs.getInt("id"));               
                cb.setSoftware(rs.getString("software"));                               
                cb.setTipo_licenca(rs.getString("licenca"));
                cb.setData_ativacao(rs.getDate("data_ativacao"));
                cb.setCod_ativacao(rs.getString("codativacao"));
                cb.setReativacao(rs.getString("flg_reativacao"));
                cb.setMotivo_reativacao(rs.getString("motivo"));                
                licencas.add(cb);                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Existe Registro!");
            e.printStackTrace();
        } finally{
            con.desconecta();
        }
        return licencas;
    }    
    
    public void gravarLicenca(ClientesBean cb) {
        ConexaoBD con = new ConexaoBD();
        try {
            pstm = con.conecta().prepareStatement(gravaLicenca);
            pstm.setInt(1, cb.getId_licenca());
            pstm.setInt(2, cb.getId_cliente());
            pstm.setString(3, cb.getSoftware());            
            pstm.setString(4, cb.getTipo_licenca());
            pstm.setDate(5, cb.getData_ativacao());
            pstm.setString(6, cb.getCod_ativacao());
            pstm.setString(7, cb.getReativacao());            
            pstm.setString(8, cb.getMotivo_reativacao());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Gravado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Gravar o Registro!");
            e.printStackTrace();
        } finally{
            con.desconecta();
        }
    }    
    
    public void alterarLicenca(ClientesBean cb) {
        ConexaoBD con = new ConexaoBD();
        try {
            pstm = con.conecta().prepareStatement(alteraLicenca);            
            pstm.setString(1, cb.getSoftware());            
            pstm.setString(2, cb.getTipo_licenca());
            pstm.setDate(3, cb.getData_ativacao());
            pstm.setString(4, cb.getCod_ativacao());
            pstm.setString(5, cb.getReativacao());            
            pstm.setString(6, cb.getMotivo_reativacao());
            pstm.setInt(7, cb.getId_licenca());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Alterado com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Alterar o Registro!");
            e.printStackTrace();
        } finally{
            con.desconecta();
        }
    }    
    
}
