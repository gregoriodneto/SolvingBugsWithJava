→ Problemas:

- Ele inicia com `public` na classe BankService
- Ele tem um problema de lógica em relação a condição `if`  de dentro do BankService onde para poder transferir um valor é necessário o valor da minha conta bancária ser maior do que o valor a ser transferido e não funciona assim, se minha conta bancária tiver o mesmo valor a ser transferido pode sem problemas.
- Ele esta fazendo tudo com o `setBalance`e isto é inviável, o cálculo e tudo mais esta fazendo dentro do serviço `BankService`  e o cálculo tem que ser feito dentro do Account.
- Outro problema é que para instanciar uma conta no Main e adicionar um valor eu ainda preciso usar o `setBalance` Não tem construtor para poder instancializar o Account com um valor.
- O Sistema de notificações dentro do service pode continuar, sem problemas, para algo simples, mas o bom seria um evento externo
- Também o código não é encapsulado, muito fácil de usar em outras classes
- Precisa tratar o Account e criar uma classe para Transferencia entre Accounts, isso facilita o desenvolvimento e tira total responsabilidade do BankService.


-> Soluções:
- Por que usei o BigDecimal? Para tratamento performático de valores e torna-se perfeito para tratar valores envolvendo dinheiro.
- Fiz a separação entre o `BankService` e o `Account`, então coloquei a regra de negócios de fato no `Account` onde de fato deve esta, tratando o debito e conta, o crédito e verificando se aquela conta pode realizar a transferência com o `canDebit`.
- Removi o log de falha do `transfer`deixando apenas o log de successful e o restante do tratamento via erro.
- Tornou algo bem mais escalável, fácil de ler e dar manutenção e sem o bug de lógica e compilação.