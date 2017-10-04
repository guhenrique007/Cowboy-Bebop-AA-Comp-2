
========================
READ ME
========================

Para executar o projeto a partir da linha de comando, vá para a pasta dist e
Digite o seguinte:

Java -jar "jogoCowboy.jar"

Para distribuir este projeto, feche a pasta dist (incluindo a pasta lib)
E distribua o arquivo ZIP.

OBS:Para executar o jogo sem interface gráfica, basta executar o arquivo Engine.java

Notas:

* Se dois arquivos JAR no classpath do projeto tiverem o mesmo nome, apenas o primeiro
O arquivo JAR é copiado para a pasta lib.
* Somente arquivos JAR são copiados para a pasta lib.
Se o classpath contiver outros tipos de arquivos ou pastas, esses arquivos (pastas)
Não são copiados.
* Se uma biblioteca no classpath de projetos também possui um elemento Class-Path
Especificado no manifesto, o conteúdo do elemento Class-Path deve estar em
O caminho do tempo de execução dos projetos.
* Para definir uma classe principal em um projeto Java padrão, clique com o botão direito do mouse no nó do projeto
Na janela Projetos e escolha Propriedades. Em seguida, clique em Executar e digite o
Nome da classe no campo Classe principal. Alternativamente, você pode digitar manualmente
Nome da classe no elemento manifesto Main-Class.
