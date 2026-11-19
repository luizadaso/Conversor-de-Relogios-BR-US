# 🕒 Conversor de Relógios BR-US

Sistema desenvolvido em **Java 21 puro** para manipulação e conversão de horários entre os formatos de exibição utilizados no **Brasil (24 horas)** e nos **Estados Unidos (12 horas com AM/PM)**.

O projeto utiliza conceitos modernos da linguagem Java, incluindo **classes seladas (sealed classes)**, encapsulamento, herança controlada e abstração.

---

## Descrição

O Clock Converter permite inserir um horário e exibi-lo em diferentes padrões de formatação.

A arquitetura foi construída a partir da classe abstrata selada `Clock`, responsável por armazenar e validar horas, minutos e segundos, além de definir o contrato para conversão entre formatos de relógio.

O sistema possui implementações específicas para cada padrão de horário:

- 🇧🇷 Formato Brasileiro (24 horas)
- 🇺🇸 Formato Americano (12 horas com AM/PM)

---

## 🚀 Tecnologias & Ferramentas

- Java 21
- Programação Orientada a Objetos (POO)
- Classes Seladas (`sealed`)
- Herança
- Abstração
- Encapsulamento
- IntelliJ IDEA (ou IDE compatível)
- Git
- GitHub

---

## Funcionalidades

- Cadastro de hora, minuto e segundo.
- Validação básica dos valores informados.
- Formatação automática de horários.
- Exibição com preenchimento de zeros à esquerda.
- Conversão entre formato brasileiro e americano.
- Controle da hierarquia através de classes seladas.
- Estrutura orientada a objetos e extensível.

### Exemplo de saída

#### Formato Brasileiro

```text
14:30:45
```

#### Formato Americano

```text
02:30:45 PM
```

---

## Usabilidade

### Executando o projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/clock-converter.git
```

2. Acesse a pasta do projeto:

```bash
cd clock-converter
```

3. Compile a aplicação:

```bash
javac *.java
```

4. Execute o programa:

```bash
java Main
```

5. Informe um horário válido para visualizar sua representação nos formatos disponíveis.

---

## Estrutura do*Projeto

```text
src/
└── br/
    ── com/
        └── clock/
            ├── Clock.java
            ├── BRClock.java
            ├── USClock.java
            └── Main.java
```

---

## Uso de Classes Sealeds

O projeto utiliza o recurso de **Sealed Classes**, introduzido nas versões recentes do Java.

```
java public sealed abstract class Clock permits BRClock, USClock {
}
```

Dessa forma, apenas as classes `BRClock` e `USClock` podem estender da classe base `Clock`, garantindo maior controle sobre a hierarquia da aplicação.

---

## Conceitos Aplicados

- Classes Abstratas
- Classes Seladas (Sealed)
- Modificador `protected`
- Polimorfismo
- Encapsulamento
- Conversão de formatos de horário
- Boas práticas de orientação a objetos

---

## 📄 Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](https://github.com/luizadaso/Relogios-do-Mundo/blob/main/LICENSE) para mais detalhes.

## Autora

Para mais informações, sinta-se à vontade para entrar em contato:

<div>
  <img src="https://github.com/user-attachments/assets/57cac2a3-49b1-4a0a-aef3-e968523971eb" width="15%" alt="autora" />
</div>

- [Github](https://github.com/luizadaso)
- [Linkedin](https://www.linkedin.com/in/luizadaso)
