package comviewzonazul.google.httpssites.zonazul.cliente.gui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import comviewzonazul.google.httpssites.zonazul.cliente.dominio.Cliente;
import comviewzonazul.google.httpssites.zonazul.cliente.dominio.Endereco;
import comviewzonazul.google.httpssites.zonazul.cliente.gui.CadastroClienteActivity2;
import comviewzonazul.google.httpssites.zonazul.R;
import comviewzonazul.google.httpssites.zonazul.cliente.negocio.ClienteNegocio;
import comviewzonazul.google.httpssites.zonazul.infraestrutura.DatabaseHelper;
import comviewzonazul.google.httpssites.zonazul.usuario.dominio.Usuario;
import comviewzonazul.google.httpssites.zonazul.usuario.gui.CadUsuarioActivity;
import comviewzonazul.google.httpssites.zonazul.usuario.negocio.UsuarioNegocio;
import util.Mensagem;

public class EditarClienteActivity extends AppCompatActivity {
    EditText txt_nome, txt_email, txt_cep, txt_numero, txt_complemento, txt_cidade;
    Button cliente_btnEditar;
    private static final String PREFERENCE_NAME = "LoginActivityPreferences";
    String login_usuario, senha_usuario, nome, email, cep, numero,complemento, cidade;
    Endereco endereco;
    Cliente cliente;
    Context context;
    ClienteNegocio clienteNegocio;
    int id;
    private Usuario usuario = new Usuario() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_cliente);

        SharedPreferences preferences = getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE);
        usuario.setLogin(preferences.getString("LOGIN", null));
        usuario.setSenha(preferences.getString("SENHA", null));

        txt_nome = (EditText) findViewById(R.id.txt_nome);
        txt_email = (EditText) findViewById(R.id.txt_email);
        txt_cep = (EditText) findViewById(R.id.txt_cep);
        txt_numero = (EditText) findViewById(R.id.txt_numero);
        txt_complemento = (EditText) findViewById(R.id.txt_complemento);
        txt_cidade = (EditText) findViewById(R.id.txt_cidade);
        cliente_btnEditar = (Button) findViewById(R.id.cliente_btnEditar);
    }

    public boolean validacao(){
        return true;
    }

    public void editar(){
        nome = txt_nome.getText().toString();
        email = txt_email.getText().toString();
        cep = txt_cep.getText().toString();
        numero = txt_numero.getText().toString();
        complemento = txt_complemento.getText().toString();
        cidade = txt_cidade.getText().toString();

    }

}

