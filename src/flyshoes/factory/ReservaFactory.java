/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyshoes.factory;

import flyshoes.cliente.ReservaRESTClient;
import flyshoes.manager.ReservaManager;

/**
 *
 * @author 2dam
 */
public class ReservaFactory {
    public ReservaManager getReservaRESTClient (){
        return new ReservaRESTClient();
    }
    
}
