# Relatório de Erros Encontrados (ERROS.md)

| Erro encontrado                                | Causa | Solução |
|:-----------------------------------------------| :--- | :--- |
| **1. Falta do this. no Construtor**            | No construtor `Funcionario(nome, salario)`, a atribuição `nome = nome` e `salario = salario` reatribuía os valores aos próprios parâmetros locais, deixando os atributos da instância como `null` e `0.0`. | Adicionada a palavra-chave `this` (`this.nome = nome;` e `this.salario = salario;`) para referenciar os atributos da classe. |
| **2. Cálculo de Aumento Percentual Incorreto** | O método `aumentarSalario(10)` fazia `salario = salario + percentual`, somando R$ 10,00 fixos em vez de aplicar 10% de aumento sobre o salário atual. | Alterado o cálculo para `this.salario += this.salario * (percentual / 100.0);`. |
| **3. Assinatura Inválida do Método `main`**    | O método principal estava declarado apenas como `static void main()`, o que impede a JVM de executar a aplicação Java. | Corrigida a assinatura do método para `public static void main(String[] args)`. |