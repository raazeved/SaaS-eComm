package tech.ada.eCommSolidario.controller;


import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import tech.ada.eCommSolidario.dto.BenfeitoresDTO;
import tech.ada.eCommSolidario.dto.BenfeitorRequestDTO;
import tech.ada.eCommSolidario.model.Benfeitor;
import tech.ada.eCommSolidario.service.BuscarBenfeitorService;
import tech.ada.eCommSolidario.service.CriarBenfeitoresService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/benfeitores")
public class BenfeitoresController {

     private final CriarBenfeitoresService criarBenfeitoresService;
     private final BuscarBenfeitorService  buscarBenfeitorService;

     public BenfeitoresController(CriarBenfeitoresService criarBenfeitoresService, BuscarBenfeitorService buscarBenfeitorService) {
        this.criarBenfeitoresService = criarBenfeitoresService;
        this.buscarBenfeitorService = buscarBenfeitorService;
     }

    @GetMapping()
    public Page<BenfeitoresDTO> listar(Pageable pageable) {
        return buscarBenfeitorService.buscarPaginada(pageable);
    }

    @GetMapping("uf/{uf}")
    public List<BenfeitoresDTO> listarPorUf(@PathVariable String uf) {
        return buscarBenfeitorService.buscarPessoasPorUf(uf);
    }

    @PostMapping()
    public BenfeitoresDTO criarBenfeitor(@Valid @RequestBody BenfeitorRequestDTO benfeitor) {
        return criarBenfeitoresService.executar(benfeitor);
    }
}