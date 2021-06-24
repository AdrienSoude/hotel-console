package fr.projethotel.core;

import fr.projethotel.core.entity.Client;
import fr.projethotel.core.service.ServiceChambre;
import fr.projethotel.core.service.ServiceClient;
import fr.projethotel.core.service.ServiceHotel;
import fr.projethotel.core.service.ServiceMenu;

public class Main {
    public static void main(String... args){

        ServiceMenu serviceMenu = new ServiceMenu();
        serviceMenu.menu();



    }
}
