# Cadastro: formulário e navegação entre telas (Android)

App Android em **Java** com uma tela de cadastro e uma segunda tela que exibe os dados informados. Foi feito como exercício da disciplina de Programação para Dispositivos Móveis (ADS, Cruzeiro do Sul EAD) para praticar **RadioButton, CheckBox e Intent**.

## O que o app faz

- Tela de cadastro com CPF, nome e idade
- Seleção de filmes de interesse (CheckBox, múltipla escolha)
- Seleção de sexo (RadioGroup com RadioButton, escolha única)
- Ao tocar em "Mostrar em Outra Tela", abre a `ResultadoActivity` com os dados enviados
- Botão "Voltar" na segunda tela, que retorna ao cadastro
- Avisa o usuário (Toast) se nenhum sexo for selecionado, evitando um crash

## Conceitos praticados

- `RadioGroup` e `RadioButton` (escolha única) e `CheckBox` (múltipla escolha)
- Eventos de clique com `setOnClickListener`
- Navegação entre telas com `Intent` e `startActivity`
- Envio e recebimento de dados com `putExtra` e `getStringExtra`
- Encerramento de uma Activity com `finish()`
- Registro de Activities no `AndroidManifest.xml`
- Tratamento de `getCheckedRadioButtonId()` retornando `-1` (evita `NullPointerException`)
- `ScrollView` para telas que podem não caber na altura do aparelho

## Tecnologias

- Java
- Android Studio
- Template Empty Views Activity

## Como rodar

1. Clone o repositório
2. Abra a pasta no Android Studio
3. Aguarde o Gradle sincronizar
4. Execute em um emulador ou em um aparelho Android

## Estrutura principal

- `MainActivity.java`: tela de cadastro e envio dos dados via Intent
- `ResultadoActivity.java`: recebe os dados e os exibe
- `res/layout/activity_main.xml`: layout do formulário
- `res/layout/activity_resultado.xml`: layout da tela de resultado
