/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyshoes.manager;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.WebTarget;


/**
 *
 * @author 2dam
 */
public interface ReservaManager {

    public <T> T findReservasCanceladas(Class<T> responseType) throws ClientErrorException;

    public void edit(Object requestEntity) throws ClientErrorException;

    public <T> T findReservasConfirmadas(Class<T> responseType) throws ClientErrorException;

    public <T> T find(Class<T> responseType, String id) throws ClientErrorException;

    public void create(Object requestEntity) throws ClientErrorException;

    public <T> T findReservasRealizadas(Class<T> responseType) throws ClientErrorException;

    public void remove(String id) throws ClientErrorException;

    public void close();

}
