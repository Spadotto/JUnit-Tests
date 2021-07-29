package entidade;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class UsuarioTest {
	
	private Usuario newUser = new Usuario("666.666.666-66", "Jurema", "321");
	private static Cartao cartao = new Cartao("6666-6666-6666-6666", 666.0);
	private static Usuario user = new Usuario("999.999.999-99", "Pafuncio", "123", cartao);
	double saldoanterior = cartao.getSaldo();
	
	@Test
	void loginUser() {
		Usuario onUser = new Usuario("999.999.999-99", "Pafuncio", "123", cartao);
		assertEquals(onUser.equals(onUser), user.equals(user));
		System.out.println("Login com sucesso");
	}
	
	@Test
	void cadastroUser() {
		assertNotEquals(newUser, user);
		System.out.println("Cadastro com sucesso");
	}
	
	@Test
	void noCard() {
		assertNull(newUser.getCartao());
	}
	
	@Test
	void novoUser() {
		assertThrows(NullPointerException.class, () -> {
			newUser.getCartao().equals(null);
		});
	}
	
	@Test
	void groupAssertions() {
	    assertAll("usuarios validos",
	        () -> assertNotEquals(newUser, user),
	        () -> assertEquals(newUser.getNome(), "Jurema"),
	        () -> assertEquals(user.getNome(), "Pafuncio")
	        );
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Checking DataBase Connection!");
	}
	
	@AfterEach
	void afterEach() {
		saldoanterior = cartao.getSaldo() + 100.0;
		cartao.setSaldo(saldoanterior);
	}
	
	@BeforeAll
	static void iniciarDB() {
		System.out.println("Conectando ao Banco de Dados...");
	}
	
	@AfterAll
	static void fecharDB() {
		System.out.println("Saldo final: " + user.getCartao().getSaldo());
		System.out.println("Fechando a conexão com o Banco de Dados...");
	}
	
	@Test
	@Disabled
	void disabledTest() {
		
	}
	
	@Test
	@Timeout(value = 5, unit = TimeUnit.MILLISECONDS)
	void systemPauseBreak() throws InterruptedException {
		Thread.sleep(5);
	}
	
	@Test
	void checkName() {
		Assumptions.assumeFalse(newUser.getCpf().isEmpty());
	}
	
	@Test
	void checkCard() {
		Assumptions.assumeTrue(newUser.getCartao() == null);
	}

}
