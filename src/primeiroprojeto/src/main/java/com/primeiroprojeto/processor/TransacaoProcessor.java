package com.primeiroprojeto.processor;

import com.primeiroprojeto.dominio.Transacao;
import org.springframework.batch.item.ItemProcessor;

public class TransacaoProcessor implements ItemProcessor<Transacao, Transacao> {
    @Override
    public Transacao process(Transacao transacao) throws Exception {
        System.out.println(String.format("\nAplicando regras de negócio no transacao %s",transacao.getDescricao()));
        return transacao;
    }
}
