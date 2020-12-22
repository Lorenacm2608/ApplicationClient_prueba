/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyshoes.factory;

import flyshoes.manager.ProductoManager;
import flyshoes.restfuls.ProductoRESTClient;

/**
 *
 * @author 2dam
 */
public class ProductoFactory {
    public ProductoManager getProductoRESTClient (){
        return new ProductoRESTClient();
    }
}
