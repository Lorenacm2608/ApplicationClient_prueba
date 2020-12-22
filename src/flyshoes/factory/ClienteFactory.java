/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyshoes.factory;

import flyshoes.manager.ClienteManager;
import flyshoes.restfuls.ClienteRESTClient;

/**
 *
 * @author 2dam
 */
public class ClienteFactory {
    public ClienteManager getClienteRESTClient (){
        return new ClienteRESTClient();
    }
}
