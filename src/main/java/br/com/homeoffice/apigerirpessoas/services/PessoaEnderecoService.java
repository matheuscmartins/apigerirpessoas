package br.com.homeoffice.apigerirpessoas.services;

import br.com.homeoffice.apigerirpessoas.domain.Endereco;
import br.com.homeoffice.apigerirpessoas.domain.PessoaEndereco;
import br.com.homeoffice.apigerirpessoas.domain.dto.PessoaEnderecoDTO;

import java.util.List;

public interface PessoaEnderecoService {
    PessoaEndereco findById(Long id);
    List<PessoaEndereco> findAll();
    PessoaEndereco create(PessoaEnderecoDTO obj);
    PessoaEndereco update(PessoaEnderecoDTO obj);
    void delete(Long id);
    List<Endereco> FindByPessoaNome(String nome);
}
