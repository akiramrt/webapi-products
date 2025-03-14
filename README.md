Para rodar o projeto é necessário digital no terminal:

Verificar a pasta que está sendo executado os comando

1. java --version
2. mvn --version
3. mvn spring-boot:run



---------------------------------------------------------

Se quiser executar a simulação do BD: H2 basta executar:

1. http://localhost:8080/h2-console
2. Se necessário substituir a "url": jdbc:h2:mem:testdb
3. Executar as querys que você deseja, como: SELECT * FROM product;
4. Caso queira fazer um GET, POST, PUT, ... pode ser feito via insomnia