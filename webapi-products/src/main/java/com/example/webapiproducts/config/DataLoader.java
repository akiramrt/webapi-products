
package com.example.webapiproducts.config;

import com.example.webapiproducts.model.Product;
import com.example.webapiproducts.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadDatabase(ProductRepository productRepository) {
        return args -> {
            // Limpa o banco antes de inserir os produtos
            productRepository.deleteAll();

            List<Product> products = List.of(
                new Product(null, "Teclado Mecânico", 250.0),
                new Product(null, "Mouse Gamer", 150.0),
                new Product(null, "Monitor Full HD", 1200.0),
                new Product(null, "Notebook Dell", 4500.0),
                new Product(null, "Cadeira Gamer", 750.0),
                new Product(null, "Fone de Ouvido Bluetooth", 300.0),
                new Product(null, "Webcam Full HD", 180.0),
                new Product(null, "Microfone Condensador", 500.0),
                new Product(null, "SSD 1TB NVMe", 800.0),
                new Product(null, "HD Externo 2TB", 450.0),
                new Product(null, "Placa de Vídeo RTX 3060", 2500.0),
                new Product(null, "Fonte 750W 80 Plus Gold", 600.0),
                new Product(null, "Memória RAM 16GB DDR4", 320.0),
                new Product(null, "Processador Ryzen 7", 1800.0),
                new Product(null, "Gabinete Gamer RGB", 400.0),
                new Product(null, "Mousepad XXL", 100.0),
                new Product(null, "Switch HDMI 4 portas", 90.0),
                new Product(null, "Cabo DisplayPort 1.4", 70.0),
                new Product(null, "Carregador Turbo USB-C", 120.0),
                new Product(null, "Hub USB 3.0", 80.0),
                new Product(null, "Tablet Samsung", 1100.0),
                new Product(null, "Smartphone Android", 2500.0),
                new Product(null, "Smartwatch Xiaomi", 600.0),
                new Product(null, "Câmera de Segurança Wi-Fi", 350.0),
                new Product(null, "Teclado Bluetooth Compacto", 200.0),
                new Product(null, "Controle Xbox Series X", 400.0),
                new Product(null, "Headset Gamer com RGB", 550.0),
                new Product(null, "Estabilizador de Energia", 280.0),
                new Product(null, "Impressora Multifuncional", 900.0),
                new Product(null, "Mouse Ergonômico Sem Fio", 220.0),
                new Product(null, "Roteador Wi-Fi 6", 650.0),
                new Product(null, "Fire TV Stick 4K", 350.0),
                new Product(null, "Echo Dot Alexa", 380.0),
                new Product(null, "Balança Digital Inteligente", 210.0),
                new Product(null, "Monitor Curvo Ultrawide", 2300.0),
                new Product(null, "Cabo USB-C para Lightning", 100.0),
                new Product(null, "Fita LED RGB Wi-Fi", 180.0),
                new Product(null, "SSD Externo 512GB", 420.0),
                new Product(null, "Cooler para Processador", 270.0),
                new Product(null, "Dock Station para Notebook", 550.0),
                new Product(null, "Filtro de Linha Inteligente", 160.0),
                new Product(null, "Estação de Solda Digital", 300.0),
                new Product(null, "Placa de Captura HDMI", 700.0),
                new Product(null, "Suporte Articulado para Monitor", 250.0),
                new Product(null, "Controle Remoto Universal", 90.0),
                new Product(null, "Ventilador USB Portátil", 50.0),
                new Product(null, "Cabo de Rede Cat6 10m", 80.0),
                new Product(null, "Carregador por Indução", 150.0)
            );

            productRepository.saveAll(products);

            // Confirmação no console
            long total = productRepository.count();
            System.out.println("Total de produtos no banco de dados: " + total);
        };
    }
}
