# **Tratamento de error, usados?**

- RuntimeException: exceção detectada em tempo de execução – não é
indicada pela IDE durante a compilação
- IOException: erros de entrada e saída
- NullPointerException: erro de acesso a variável nula
- SQLException: erro de acesso a banco de dados
- ArithmeticException: erro de cálculo algébrico (ex.: divisão por zero)


### **OBSERVAÇÕES**
<br>

A palavra reservada throws, seguida pela classe de exceção
gerada, deve ser indicada no cabeçalho de um método que gere
uma exceção.


<br>

#### **TROWS** 

    public int gravaRegistro () throws IOException {
    ... // Código que gera a exceção

    }


<br>


Os comandos try-catch-finally executam um código que pode
gerar exceções de maneira segura, realizando o tratamento das
exceções.

<br>


#### **TRY-CATCH-FINALLY**

    try {

    // Código que pode disparar exceções

    } catch (Excecao1 e) {

    // Código executado caso o código no bloco try
    // dispare uma exceção tipo Excecao1

    }
    ...
    catch (ExcecaoN e) {

    // Código executado caso o código no bloco try
    // dispare uma exceção tipo ExcecaoN

    } finally {

    // Código executado sempre, mesmo que tenha

    ocorrido

    // uma exceção no bloco try

    }