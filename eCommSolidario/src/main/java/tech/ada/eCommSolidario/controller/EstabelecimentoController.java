package tech.ada.eCommSolidario.controller;

import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import tech.ada.eCommSolidario.dto.BenfeitorDTO;
import tech.ada.eCommSolidario.dto.BenfeitorRequestDTO;
import tech.ada.eCommSolidario.dto.EstabelecimentoDTO;
import tech.ada.eCommSolidario.dto.EstabelecimentoRequestDTO;
import tech.ada.eCommSolidario.service.BuscarBenfeitorService;
import tech.ada.eCommSolidario.service.BuscarEstabelecimentoService;
import tech.ada.eCommSolidario.service.CriarBenfeitoresService;
import tech.ada.eCommSolidario.service.CriarEstabelecimentoService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/estabelecimentos")
public class EstabelecimentoController {

    private final CriarEstabelecimentoService criarEstabelecimentoService;
    private final BuscarEstabelecimentoService buscarEstabelecimentoService;

    public EstabelecimentoController(CriarEstabelecimentoService criarEstabelecimentoService,
                                     BuscarEstabelecimentoService buscarEstabelecimentoService) {
        this.criarEstabelecimentoService = criarEstabelecimentoService;
        this.buscarEstabelecimentoService = buscarEstabelecimentoService;
    }

    @GetMapping()
    public Page<EstabelecimentoDTO> listar(Pageable pageable) {
        return buscarEstabelecimentoService.buscarPaginada(pageable);
    }

    @GetMapping("uf/{uf}")
    public List<EstabelecimentoDTO> listarPorUf(@PathVariable String uf) {
        return buscarEstabelecimentoService.buscarestabelecimentobyUf(uf);
    }

    @PostMapping()
    public EstabelecimentoDTO  criarEstabelecimento(@Valid @RequestBody EstabelecimentoRequestDTO estabelecimento) {
        return criarEstabelecimentoService.executar(estabelecimento);
    }
}