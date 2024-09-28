package tech.ada.eCommSolidario.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.eCommSolidario.model.Usuario;
import tech.ada.eCommSolidario.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestParam String username,
                                                @RequestParam String password) {
        Usuario usuarioCriado = usuarioService.criarUsuario(username, password);
        return ResponseEntity.ok(usuarioCriado);
    }
}
