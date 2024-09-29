package tech.ada.eCommSolidario.controller;

import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import tech.ada.eCommSolidario.dto.EstabelecimentosDTO;
import tech.ada.eCommSolidario.dto.EstabelecimentoRequestDTO;
import tech.ada.eCommSolidario.service.BuscarEstabelecimentoService;
import tech.ada.eCommSolidario.service.CriarEstabelecimentoService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/estabelecimentos")
public class EstabelecimentosController {

    private final CriarEstabelecimentoService criarEstabelecimentoService;
    private final BuscarEstabelecimentoService buscarEstabelecimentoService;

    public EstabelecimentosController(CriarEstabelecimentoService criarEstabelecimentoService, BuscarEstabelecimentoService buscarEstabelecimentoService) {
        this.criarEstabelecimentoService = criarEstabelecimentoService;
        this.buscarEstabelecimentoService = buscarEstabelecimentoService;
    }

    @GetMapping()
    public Page<EstabelecimentoDTO> listar(Pageable pageable) {
        return buscarEstabelecimentoService.buscarPaginada(pageable);
    }

    @GetMapping("/tipo/{tipo}")
    public List<EstabelecimentoDTO> listarPorTipo(@PathVariable String tipo) {
        return buscarEstabelecimentoService.buscarPorTipo(tipo);
    }

    @PostMapping()
    public EstabelecimentoDTO criarEstabelecimento(@Valid @RequestBody EstabelecimentoRequestDTO estabelecimentoRequestDTO) {
        return criarEstabelecimentoService.executar(estabelecimentoRequestDTO);
    }
}