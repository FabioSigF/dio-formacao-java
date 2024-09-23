import com.bancodigital.Cliente;
import com.bancodigital.Conta;
import com.bancodigital.ContaCorrente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTest {

    @InjectMocks
    ContaCorrente conta;

    @Test
    void testarSaque() {
        conta.depositar(200);
        conta.sacar(100);

        Assertions.assertEquals(100, conta.getSaldo());
    }

}
