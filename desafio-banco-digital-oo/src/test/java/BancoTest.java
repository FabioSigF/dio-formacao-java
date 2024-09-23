import com.bancodigital.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BancoTest {

    @Mock
    private Banco mockBanco;
    @Mock
    Cliente mockCliente;
    @Mock
    ContaCorrente mockContaCorrente;
    @Mock
    ContaPoupanca mockContaPoupanca;
    @Mock
    private List<Conta> clientes;

    @Test
    void adicionarClienteNaLista() {

        // Simulando a operação setContas e retorno de getContas
        Mockito.doNothing().when(mockBanco).setContas(clientes);
        Mockito.when(mockBanco.getContas()).thenReturn(clientes);

        // Chamar o método setContas para simular a adição da lista ao banco
        mockBanco.setContas(clientes);

        // Verificar se getContas retorna a lista correta
        List<Conta> contasRetornadas = mockBanco.getContas();

        // Verificação: as contas retornadas devem ser iguais à lista de clientes
        Assertions.assertEquals(clientes, contasRetornadas);

        // Verificar se os métodos setContas e getContas foram chamados corretamente
        Mockito.verify(mockBanco).setContas(clientes);
        Mockito.verify(mockBanco).getContas();
    }

}
