package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
Import tech

@ExtendWith(MockitoExtension.class)
public class CampanhaControllerTest {

    @InjectMocks
    CampanhjaController campanhaController;
    @Mock
    CriarCampanhaService criarCampanhaService;

    @Mock
    BuscarCampanhaService buscarCampanhaService;

    MockMvc MockMvc;

    @BeforeEach
    public void setup(){
        mocMvc = MockMvcBuilders.standaloneSetup(campanhaController).build();
    }
    @Test
    void deveBuscarCampanhaPorTemaComSucesso(){


    }

}
