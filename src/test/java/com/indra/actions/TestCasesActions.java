package com.indra.actions;

import com.indra.utils.ReadFileCSV;

public class TestCasesActions {

    ReadFileCSV fileCSV = new ReadFileCSV();

    private String url;
    private String user;
    private String password;
    private String msisdn;
    private String nit;
    private String cedulavendedor;
    private String identificacion;
    private String imsi;
    private String nombreServidorPuerto;
    //private String estadolinea;

    private String path="src/test/resources/config_data/testCasesData.csv";

    public String CancelacionPorSolicitud(){

        fileCSV.readFile(path);
        url = fileCSV.data.get(1).get(1);
        user= fileCSV.data.get(1).get(2);
        password = fileCSV.data.get(1).get(3);
        msisdn = fileCSV.data.get(1).get(4);

        String caso=
                "{\n" +
                "    \"contentFeature\": [\n" +
                "        \"Feature: Cancelacion por solicitud\\n\\n Scenario Outline: Cancelacion por solicitud\\n\\tGiven Deseo navegar a la pagina <urlCrm>\\n    And Ingreso rapidamente <userCrm> en el campo \\\"User\\\"\\n    And Ingreso rapidamente <passCrm> en el campo \\\"Password\\\"\\n    And Doy click en \\\"Submit\\\"\\n    And Doy click en \\\"PostVenta\\\"\\n    And Espero que la pagina cargue\\n    And Selecciono en el arbol la opcion <opcTransacciones>\\n    And Selecciono en el arbol la opcion <opcModificacionDeLinea>\\n    And Doy click en \\\"Modificacion de linea\\\"\\n    And Espero <tiempoEspera> segundos\\n    And Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n    And Cargo la pagina interna \\\"transaccion crm portal\\\"\\n    When Ingreso rapidamente <msisdn> en el campo \\\"Numero\\\"\\n    And Doy click en \\\"servicio\\\"\\n    And Espero que el elemento \\\"loading modal box\\\" sea invisible\\n    And Selecciono <servicio> de la lista \\\"servicio\\\"\\n    When Ingreso rapidamente <reason> en el campo \\\"justificacion\\\"\\n    And Doy click en \\\"ejecutar cambio\\\"\\n    And Selecciono la opcion <alert> del mensaje de alerta\\n    And Espero que el elemento \\\"loadingbox\\\" sea invisible\\n    Then Verifico el mensaje <mensajeFinal> buscando en la lista \\\"resultados postventa\\\" y realizo scroll hasta el \\\"Resultado cambio\\\"\\n\\n Examples:\\n|urlCrm|userCrm|passCrm|opcTransacciones|opcModificacionDeLinea|tiempoEspera|msisdn|servicio|reason|alert|mensajeFinal|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Transacciones\\\"|\\\"Modificacion de Linea\\\"|\\\"5\\\"|\\\""+msisdn+"\\\"|\\\"Cancelar por Solicitud\\\"|\\\"Pruebas\\\"|\\\"Aceptar\\\"|\\\"-\\\"|\\n\"\n" +
                "    ],\n" +
                "    \"nameFeature\": [\n" +
                "        \"ESC001_ Cancelacion por solicitud\"\n" +
                "    ],\n" +
                "    \"contentProperties\": [\n" +
                "        \"|User=id:username|Password=id:password|Submit=name:login|PostVenta=linkText:Postventa|Modificacion de linea=//a[contains(text(),'Modificaci')]|transaccion crm portal=id:iframe|Numero=id:ServicesForm:msisdn|servicio=id:ServicesForm:serviceField|loading modal box=id:ajaxLoadingModalBoxContainer|justificacion=id:ServicesForm:reason|ejecutar cambio=id:ServicesForm:service|loadingbox=id:ajaxLoadingModalBoxCDiv|resultados postventa=//body//li[@class='infomsg']|Resultado cambio=xpath://body//li[%s]|\"\n" +
                "    ],\n" +
                "    \"allowsTrace\": \"0\",\n" +
                "    \"browser\": \"firefox\",\n" +
                "    \"aplicationType\": [\n" +
                "        \"Web\"\n" +
                "    ],\n" +
                "    \"aplication\": [\n" +
                "        \"CRM\"\n" +
                "    ],\n" +
                "    \"process\": [\n" +
                "        \" Cancelacion Add On\"\n" +
                "    ],\n" +
                "    \"iterations\": [\n" +
                "        1\n" +
                "    ],\n" +
                "    \"appTypeToValidate\": [\n" +
                "        \"1\"\n" +
                "    ],\n" +
                "    \"testError\": false,\n" +
                "    \"stopExecution\":false\n" +
                "}";

        return caso;
    }
    public String Reconexion430(){

        fileCSV.readFile(path);
        url = fileCSV.data.get(2).get(1);
        user= fileCSV.data.get(2).get(2);
        password = fileCSV.data.get(2).get(3);
        msisdn = fileCSV.data.get(2).get(4);

        String caso=
                "{\n" +
                        "    \"contentFeature\": [\n" +
                        "        \"Feature: Reconexion 430\\n\\n Scenario Outline: Reconexion 430\\n   Given Deseo navegar a la pagina <urlCRM>\\n    And Ingreso rapidamente <userNameCRM> en el campo \\\"User\\\"\\n    And Ingreso rapidamente <passwordCRM> en el campo \\\"Password\\\"\\n    And Doy click en \\\"Submit\\\"\\n    And Doy click en \\\"PostVenta\\\"\\n    And Espero que la pagina cargue\\n    And Selecciono en el arbol la opcion <opcTransacciones>\\n    And Selecciono en el arbol la opcion <opcModificacionDeLinea>\\n    And Doy click en \\\"reconectar linea control\\\"\\n    And Espero <tiempoEspera> segundos\\n    And Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n    And Cargo la pagina interna \\\"transaccion crm portal\\\"\\n    When Ingreso rapidamente <msisdn> en el campo \\\"msisdn reconectar\\\"\\n    And Doy click en \\\"boton consultar linea\\\"\\n    And Espero que el elemento \\\"loading modal box\\\" sea invisible\\n    And Selecciono <renovarContrato> de la lista \\\"renovar contrato reconectar\\\"\\n    And Doy click en \\\"boton reconectar 430\\\"\\n    And Selecciono la opcion <alert> del mensaje de alerta\\n    And Espero que el elemento \\\"loading modal box\\\" sea invisible\\n\\n Examples:\\n|urlCRM|userNameCRM|passwordCRM|opcTransacciones|opcModificacionDeLinea|tiempoEspera|msisdn|renovarContrato|alert|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Transacciones\\\"|\\\"Modificacion de Linea\\\"|\\\"5\\\"|\\\""+msisdn+"\\\"|\\\"SI\\\"|\\\"Aceptar\\\"|\\n\"\n" +
                        "    ],\n" +
                        "    \"nameFeature\": [\n" +
                        "        \"ESC001_ Reconexion 430\"\n" +
                        "    ],\n" +
                        "    \"contentProperties\": [\n" +
                        "        \"|User=id:username|Password=id:password|Submit=name:login|PostVenta=linkText:Postventa|reconectar linea control=//a[contains(text(),'Reconectar l')]|transaccion crm portal=id:iframe|msisdn reconectar=id:PlanschangeForm:msisdnField:msisdn|boton consultar linea=id:PlanschangeForm:consultar|loading modal box=id:ajaxLoadingModalBoxContainer|renovar contrato reconectar=id:PlanschangeForm:InfoAnnualRenewal:planField|boton reconectar 430=id:PlanschangeForm:reconectar|\"\n" +
                        "    ],\n" +
                        "    \"allowsTrace\": \"0\",\n" +
                        "    \"browser\": \"firefox\",\n" +
                        "    \"aplicationType\": [\n" +
                        "        \"Web\"\n" +
                        "    ],\n" +
                        "    \"aplication\": [\n" +
                        "        \"CRM\"\n" +
                        "    ],\n" +
                        "    \"process\": [\n" +
                        "        \" Reconexion 430\"\n" +
                        "    ],\n" +
                        "    \"iterations\": [\n" +
                        "        1\n" +
                        "    ],\n" +
                        "    \"appTypeToValidate\": [\n" +
                        "        \"1\"\n" +
                        "    ],\n" +
                        "    \"testError\": false,\n" +
                        "    \"stopExecution\":false\n" +
                "}";

        return caso;

    }
    public String RealizarCancelacionDeRoamingLineaPostpago5_2(){

        fileCSV.readFile(path);
        url = fileCSV.data.get(3).get(1);
        user= fileCSV.data.get(3).get(2);
        password = fileCSV.data.get(3).get(3);
        msisdn = fileCSV.data.get(3).get(4);

        String caso=
                "{\n" +
                        "    \"contentFeature\": [\n" +
                        "        \"Feature: Cancelacion Roaming Linea Pospago\\n\\n        Scenario Outline: Ingresa_un_nombre_de_escenario\\n   Given Deseo navegar a la pagina <urlCrm>\\n And Ingreso el dato confidencial <userCrm> en el campo \\\"User\\\" sin captura\\n And Ingreso el dato confidencial <passCrm> en el campo \\\"Password\\\" sin captura\\n And Doy click en \\\"Submit\\\"\\n And Doy click en \\\"PostVenta\\\"\\n And Espero que la pagina cargue\\n And Selecciono en el arbol la opcion <opcTransacciones>\\n And Selecciono en el arbol la opcion <opcRoaming>\\n And Doy click en \\\"Cancelacion roaming\\\"\\n And Espero <tiempoEspera> segundos\\n And Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n And Cargo la pagina interna \\\"transaccion crm portal\\\"\\n When Ingreso rapidamente <msisdn> en el campo \\\"Numero\\\"\\n And Doy click en \\\"buscar\\\"\\n And Espero <tiempoEspera> segundos\\n And Doy click en \\\"cancelar roaming\\\"\\n And Doy click en \\\"aceptar\\\"\\n\\n Examples:\\n|urlCrm|userCrm|passCrm|opcTransacciones|opcRoaming|tiempoEspera|msisdn|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Transacciones\\\"|\\\"Roaming\\\"|\\\"5\\\"|\\\""+msisdn+"\\\"|\\n\"\n" +
                        "    ],\n" +
                        "    \"nameFeature\": [\n" +
                        "        \"ESC001_ Cancelacion Roaming Linea Pospago\"\n" +
                        "    ],\n" +
                        "    \"contentProperties\": [\n" +
                        "        \"|User=//*[@name='username']|Password=//*[@name='password']|Submit=//*[@class='login-button']|PostVenta=//div[@id='UINavigationPortlet']//a[contains(text(),'Postventa')]|Cancelacion roaming=(//a[@href='#'][contains(@id,'id17')][contains(.,'Cancelaci')])[6]|transaccion crm portal=//iframe|Numero=//*[@id='formBusqueda:inputMsisdn']|buscar=//*[@name='formBusqueda:j_id17']|cancelar roaming=//*[@id='formCancelacion:j_id32']|aceptar=//*[@class='botonAceptar']|\"\n" +
                        "    ],\n" +
                        "    \"allowsTrace\": \"0\",\n" +
                        "    \"browser\": \"chrome\",\n" +
                        "    \"aplicationType\": [\n" +
                        "        \"Web\",\n" +
                        "        \"Web\"\n" +
                        "    ],\n" +
                        "    \"aplication\": [\n" +
                        "        \"CRM\",\n" +
                        "        \"CRM\"\n" +
                        "    ],\n" +
                        "    \"process\": [\n" +
                        "        \" Cancelacion Roaming Linea Pospago\",\n" +
                        "        \" Activacion Control para cliente CC\"\n" +
                        "    ],\n" +
                        "    \"iterations\": [\n" +
                        "        1,\n" +
                        "        1\n" +
                        "    ],\n" +
                        "    \"appTypeToValidate\": [\n" +
                        "        \"1\",\n" +
                        "        \"1\"\n" +
                        "    ],\n" +
                        "    \"testError\": false,\n" +
                        "    \"stopExecution\":false\n" +
                "}";
    return caso;
    }
    public String CambioDePospagoAPospagoGenerico(){
        fileCSV.readFile(path);
        url = fileCSV.data.get(4).get(1);
        user= fileCSV.data.get(4).get(2);
        password = fileCSV.data.get(4).get(3);
        msisdn = fileCSV.data.get(4).get(4);

        String caso=
                "{\n" +
                        "    \"contentFeature\": [\n" +
                        "        \"Feature: Cambio de Pospago a Pospago Generico\\n\\n     Scenario Outline: Cambio de linea Pospago a Pospago\\n\\tGiven Deseo navegar a la pagina <urlCrm>\\n\\tAnd Ingreso rapidamente <userCrm> en el campo \\\"User\\\"\\n\\tAnd Ingreso rapidamente <passCrm> en el campo \\\"Password\\\"\\n\\tAnd Doy click en \\\"Submit\\\"\\n\\tAnd Doy click en \\\"PostVenta\\\"\\n\\tAnd Espero que la pagina cargue\\n\\tAnd Selecciono en el arbol la opcion <opcTransacciones>\\n\\tAnd Selecciono en el arbol la opcion <opcModificacionDeLinea>\\n\\tAnd Doy click en \\\"Cambio de plan Controles y Pospagos\\\"\\n\\tAnd Espero <tiempoEspera> segundos\\n\\tAnd Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n\\tAnd Cargo la pagina interna \\\"transaccion crm portal\\\"\\n\\tWhen Ingreso rapidamente <msisdn> en el campo \\\"Numero de Movil\\\"\\n    And Doy click en \\\"titulo\\\"\\n\\tAnd Ingreso rapidamente <motivo> en el campo \\\"Motivo del Cambio\\\"\\n\\tAnd Espero que el elemento \\\"loading box\\\" sea invisible\\n\\tAnd Selecciono <listaPlan> de la lista \\\"plan destino\\\"\\n\\tAnd Selecciono <contrato> de la lista \\\"renovacion contrato\\\"\\n\\tAnd Doy click en \\\"fecha calendario\\\"\\n\\tAnd Espero que el elemento \\\"loading box\\\" sea invisible\\n\\tAnd Doy click en \\\"boton cambiar plan\\\"\\n\\tThen Selecciono la opcion <alert> del mensaje de alerta\\n\\tAnd Espero que cargue completamente el documento de la pagina\\n\\tThen Verifico el mensaje <mensajeFinal> buscando en la lista \\\"resultados postventa\\\" y realizo scroll hasta el \\\"Resultado cambio\\\"\\n\\n Examples:\\n|urlCrm|userCrm|passCrm|opcTransacciones|opcModificacionDeLinea|tiempoEspera|msisdn|motivo|listaPlan|contrato|alert|mensajeFinal|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Transacciones\\\"|\\\"Modificacion de Linea\\\"|\\\"5\\\"|\\\""+msisdn+"\\\"|\\\"Cambio de plan pospago a prepago\\\"|\\\"740-Pospago 5.2-\\\"|\\\"SI\\\"|\\\"Aceptar\\\"|\\\"\\\"|\\n\"\n" +
                        "    ],\n" +
                        "    \"nameFeature\": [\n" +
                        "        \"ESC001_ Cambio de Pospago a Pospago Generico\"\n" +
                        "    ],\n" +
                        "    \"contentProperties\": [\n" +
                        "        \"|User=id:username|Password=id:password|Submit=name:login|PostVenta=linkText:Postventa|Cambio de plan Controles y Pospagos=xpath://a[contains(text(),'Cambio de plan Controles y Pospagos')]|transaccion crm portal=id:iframe|Numero de Movil=id:PlanschangeForm:msisdnField:msisdn|titulo=//h1[contains(text(),'Cambio')]|Motivo del Cambio=id:PlanschangeForm:reasonField:reason|loading box=id:ajaxLoadingModalBoxCDiv|plan destino=id:PlanschangeForm:planField2|renovacion contrato=name:PlanschangeForm:InfoAnnualRenewal:decisionField|fecha calendario=id:PlanschangeForm:IdFechaCalendarizarInputDate|boton cambiar plan=id:PlanschangeForm:bntPlanChange|resultados postventa=//body//li[@class='infomsg']|Resultado cambio=xpath://body//li[%s]|\"\n" +
                        "    ],\n" +
                        "    \"allowsTrace\": \"0\",\n" +
                        "    \"browser\": \"chrome\",\n" +
                        "    \"aplicationType\": [\n" +
                        "        \"Web\"\n" +
                        "    ],\n" +
                        "    \"aplication\": [\n" +
                        "        \"CRM\"\n" +
                        "    ],\n" +
                        "    \"process\": [\n" +
                        "        \" Cambio de Pospago a Pospago Generico\"\n" +
                        "    ],\n" +
                        "    \"iterations\": [\n" +
                        "        1\n" +
                        "    ],\n" +
                        "    \"appTypeToValidate\": [\n" +
                        "        \"1\"\n" +
                        "    ],\n" +
                        "    \"testError\": false,\n" +
                        "    \"stopExecution\":false\n" +
                        "}";

        return caso;
    }
    public String CambioDeChip_imsi(){
        fileCSV.readFile(path);
        url = fileCSV.data.get(5).get(1);
        user= fileCSV.data.get(5).get(2);
        password = fileCSV.data.get(5).get(3);
        msisdn = fileCSV.data.get(5).get(4);
        imsi= fileCSV.data.get(5).get(7);

        String caso=
                "{\n" +
                        "    \"contentFeature\": [\n" +
                        "        \"Feature: Cambio de Chip (imsi)\\n\\n Scenario Outline: Cambio de Chip (imsi)\\n\\tGiven Deseo navegar a la pagina <urlCrm>\\n\\tAnd Ingreso rapidamente <userCrm> en el campo \\\"User\\\"\\n\\tAnd Ingreso rapidamente <passCrm> en el campo \\\"Password\\\"\\n\\tAnd Doy click en \\\"Submit\\\"\\n\\tAnd Doy click en \\\"PostVenta\\\"\\n\\tAnd Espero que la pagina cargue\\n\\tAnd Selecciono en el arbol la opcion <opcTransacciones>\\n\\tAnd Selecciono en el arbol la opcion <opcModificacionDeLinea>\\n\\tAnd Doy click en \\\"Cambio de chip\\\"\\n\\tAnd Espero <tiempoEspera> segundos\\n\\tAnd Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n\\tAnd Cargo la pagina interna \\\"transaccion crm portal\\\"\\n\\tWhen Ingreso rapidamente <msisdn> en el campo \\\"numero msisdn\\\"\\n\\tAnd Doy click en \\\"boton imprimir\\\"\\n\\tAnd Espero que el elemento \\\"loading modal box\\\" sea invisible\\n\\tAnd Ingreso rapidamente <razon> en el campo \\\"razon cambio\\\"\\n\\tAnd Ingreso rapidamente <imsi> en el campo \\\"imsi cambio\\\"\\n\\tAnd Doy click en \\\"buscar imsi\\\"\\n\\tAnd Espero que el elemento \\\"loading modal box\\\" sea invisible\\n\\tThen Verifico el mensaje <mensajeFinal> buscando en la lista \\\"resultados postventa\\\" y realizo scroll hasta el \\\"Resultado cambio\\\"\\n\\n Examples:\\n|urlCrm|userCrm|passCrm|opcTransacciones|opcModificacionDeLinea|tiempoEspera|msisdn|razon|imsi|mensajeFinal|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Transacciones\\\"|\\\"Modificacion de linea\\\"|\\\"5\\\"|\\\""+msisdn+"\\\"|\\\"Perdida de chip\\\"|\\\""+imsi+"\\\"|\\\"\\\"|\\n\"\n" +
                        "    ],\n" +
                        "    \"nameFeature\": [\n" +
                        "        \"ESC001_ Cambio de Chip (imsi)\"\n" +
                        "    ],\n" +
                        "    \"contentProperties\": [\n" +
                        "        \"|User=id:username|Password=id:password|Submit=name:login|PostVenta=linkText:Postventa|Cambio de chip=linkText:Cambio de Chip|transaccion crm portal=id:iframe|numero msisdn=id:imsiChangeForm:msisdnField:msisdn|boton imprimir=id:imsiChangeForm:printButton|loading modal box=id:ajaxLoadingModalBoxContainer|razon cambio=id:imsiChangeForm:reasonField:reason|imsi cambio=id:imsiChangeForm:imsiField:imsi|buscar imsi=id:imsiChangeForm:imsiField:bntImsi|resultados postventa=//body//li[@class='infomsg']|Resultado cambio=xpath://body//li[%s]|\"\n" +
                        "    ],\n" +
                        "    \"allowsTrace\": \"0\",\n" +
                        "    \"browser\": \"chrome\",\n" +
                        "    \"aplicationType\": [\n" +
                        "        \"Web\"\n" +
                        "    ],\n" +
                        "    \"aplication\": [\n" +
                        "        \"CRM\"\n" +
                        "    ],\n" +
                        "    \"process\": [\n" +
                        "        \" Cambio de Chip (imsi)\"\n" +
                        "    ],\n" +
                        "    \"iterations\": [\n" +
                        "        1\n" +
                        "    ],\n" +
                        "    \"appTypeToValidate\": [\n" +
                        "        \"1\"\n" +
                        "    ],\n" +
                        "    \"testError\": false,\n" +
                        "    \"stopExecution\":false\n" +
                        "}";

        return caso;
    }
    public String SuspensionRoboPerdidaEnLineaPortada(){

        fileCSV.readFile(path);
        url = fileCSV.data.get(6).get(1);
        user= fileCSV.data.get(6).get(2);
        password = fileCSV.data.get(6).get(3);
        msisdn = fileCSV.data.get(6).get(4);


        String caso=
                "{\n" +
                        "    \"contentFeature\": [\n" +
                        "        \"Feature: Suspension Robo Perdida en linea portada\\n\\n    Scenario Outline: Suspension Robo Perdida en linea portada\\n    Given Deseo navegar a la pagina <urlCrm>\\n\\tAnd Ingreso rapidamente <userCrm> en el campo \\\"User\\\"\\n\\tAnd Ingreso rapidamente <passCrm> en el campo \\\"Password\\\"\\n\\tAnd Doy click en \\\"Submit\\\"\\n\\tAnd Doy click en \\\"PostVenta\\\"\\n\\tAnd Espero que la pagina cargue\\n\\tAnd Selecciono en el arbol la opcion <opcTransacciones>\\n\\tAnd Selecciono en el arbol la opcion <opcModificacionDeLinea>\\n\\tAnd Doy click en \\\"Modificacion de linea\\\"\\n\\tAnd Espero <tiempoEspera> segundos\\n\\tAnd Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n\\tAnd Cargo la pagina interna \\\"transaccion crm portal\\\"\\n\\tWhen Ingreso rapidamente <msisdn> en el campo \\\"Numero\\\"\\n\\tAnd Doy click en \\\"servicio\\\"\\n\\tAnd Espero que el elemento \\\"loading modal box\\\" sea invisible\\n\\tAnd Selecciono <servicio> de la lista \\\"servicio\\\"\\n\\tWhen Ingreso rapidamente <reason> en el campo \\\"justificacion\\\"\\n\\tAnd Doy click en \\\"ejecutar cambio\\\"\\n\\tAnd Selecciono la opcion <alert> del mensaje de alerta\\n\\tAnd Espero que el elemento \\\"loadingbox\\\" sea invisible\\n\\tThen Verifico el mensaje <mensajeFinal> buscando en la lista \\\"resultados postventa\\\" y realizo scroll hasta el \\\"Resultado cambio\\\"\\n\\n Examples:\\n|urlCrm|userCrm|passCrm|opcTransacciones|opcModificacionDeLinea|tiempoEspera|msisdn|servicio|reason|alert|mensajeFinal|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Transacciones\\\"|\\\"Modificacion de Linea\\\"|\\\"5\\\"|\\\""+msisdn+"\\\"|\\\"Suspensi¿ Perdida/Extrav¿ Chip\\\"|\\\"prueba caso merlin\\\"|\\\"Aceptar\\\"|\\\"\\\"|\\n\"\n" +
                        "    ],\n" +
                        "    \"nameFeature\": [\n" +
                        "        \"ESC001_ Suspension Robo Perdida en linea portada\"\n" +
                        "    ],\n" +
                        "    \"contentProperties\": [\n" +
                        "        \"|User=id:username|Password=id:password|Submit=name:login|PostVenta=linkText:Postventa|Modificacion de linea=//a[contains(text(),'Modificaci')]|transaccion crm portal=id:iframe|Numero=id:ServicesForm:msisdn|servicio=id:ServicesForm:serviceField|loading modal box=id:ajaxLoadingModalBoxContainer|justificacion=id:ServicesForm:reason|ejecutar cambio=id:ServicesForm:service|loadingbox=id:ajaxLoadingModalBoxCDiv|resultados postventa=//body//li[@class='infomsg']|Resultado cambio=xpath://body//li[%s]|\"\n" +
                        "    ],\n" +
                        "    \"allowsTrace\": \"0\",\n" +
                        "    \"browser\": \"firefox\",\n" +
                        "    \"aplicationType\": [\n" +
                        "        \"Web\"\n" +
                        "    ],\n" +
                        "    \"aplication\": [\n" +
                        "        \"CRM\"\n" +
                        "    ],\n" +
                        "    \"process\": [\n" +
                        "        \" Reconexion Robo Perdida en linea portada\"\n" +
                        "    ],\n" +
                        "    \"iterations\": [\n" +
                        "        1\n" +
                        "    ],\n" +
                        "    \"appTypeToValidate\": [\n" +
                        "        \"1\"\n" +
                        "    ],\n" +
                        "    \"testError\": false,\n" +
                        "    \"stopExecution\":false\n" +
                        "}";


        return caso;
    }
    public String ReconexionRoboPerdidaEnLineaPortada(){
        fileCSV.readFile(path);
        url = fileCSV.data.get(7).get(1);
        user= fileCSV.data.get(7).get(2);
        password = fileCSV.data.get(7).get(3);
        msisdn = fileCSV.data.get(7).get(4);

        String caso =
                "{\n" +
                        "    \"contentFeature\": [\n" +
                        "        \"Feature: Reconexion Robo Perdida en linea portada\\n\\n   Scenario Outline: Ingresa_un_nombre_de_escenario\\n    Given Deseo navegar a la pagina <urlCrm>\\n\\tAnd Ingreso rapidamente <userCrm> en el campo \\\"User\\\"\\n\\tAnd Ingreso rapidamente <passCrm> en el campo \\\"Password\\\"\\n\\tAnd Doy click en \\\"Submit\\\"\\n\\tAnd Doy click en \\\"PostVenta\\\"\\n\\tAnd Espero que la pagina cargue\\n\\tAnd Selecciono en el arbol la opcion <opcTransacciones>\\n\\tAnd Selecciono en el arbol la opcion <opcModificacionDeLinea>\\n\\tAnd Doy click en \\\"Modificacion de linea\\\"\\n\\tAnd Espero <tiempoEspera> segundos\\n\\tAnd Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n\\tAnd Cargo la pagina interna \\\"transaccion crm portal\\\"\\n\\tWhen Ingreso rapidamente <msisdn> en el campo \\\"Numero\\\"\\n\\tAnd Doy click en \\\"servicio\\\"\\n\\tAnd Espero que el elemento \\\"loading modal box\\\" sea invisible\\n\\tAnd Selecciono <servicio> de la lista \\\"servicio\\\"\\n\\tWhen Ingreso rapidamente <reason> en el campo \\\"justificacion\\\"\\n\\tAnd Doy click en \\\"ejecutar cambio\\\"\\n\\tAnd Selecciono la opcion <alert> del mensaje de alerta\\n\\tAnd Espero que el elemento \\\"loadingbox\\\" sea invisible\\n\\tThen Verifico el mensaje <mensajeFinal> buscando en la lista \\\"resultados postventa\\\" y realizo scroll hasta el \\\"Resultado cambio\\\"\\n\\n Examples:\\n|urlCrm|userCrm|passCrm|opcTransacciones|opcModificacionDeLinea|tiempoEspera|msisdn|servicio|reason|alert|mensajeFinal|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Transacciones\\\"|\\\"Modificacion de Linea\\\"|\\\"5\\\"|\\\""+msisdn+"\\\"|\\\"Reconexi¿ CHIP Robo/Perdida\\\"|\\\"prueba caso merlin\\\"|\\\"Aceptar\\\"|\\\"\\\"|\\n\"\n" +
                        "    ],\n" +
                        "    \"nameFeature\": [\n" +
                        "        \"ESC001_ Reconexion Robo Perdida en linea portada\"\n" +
                        "    ],\n" +
                        "    \"contentProperties\": [\n" +
                        "        \"|User=id:username|Password=id:password|Submit=name:login|PostVenta=linkText:Postventa|Modificacion de linea=//a[contains(text(),'Modificaci')]|transaccion crm portal=id:iframe|Numero=id:ServicesForm:msisdn|servicio=id:ServicesForm:serviceField|loading modal box=id:ajaxLoadingModalBoxContainer|justificacion=id:ServicesForm:reason|ejecutar cambio=id:ServicesForm:service|loadingbox=id:ajaxLoadingModalBoxCDiv|resultados postventa=//body//li[@class='infomsg']|Resultado cambio=xpath://body//li[%s]|\"\n" +
                        "    ],\n" +
                        "    \"allowsTrace\": \"0\",\n" +
                        "    \"browser\": \"firefox\",\n" +
                        "    \"aplicationType\": [\n" +
                        "        \"Web\"\n" +
                        "    ],\n" +
                        "    \"aplication\": [\n" +
                        "        \"CRM\"\n" +
                        "    ],\n" +
                        "    \"process\": [\n" +
                        "        \" Reconexion Robo Perdida en linea portada\"\n" +
                        "    ],\n" +
                        "    \"iterations\": [\n" +
                        "        1\n" +
                        "    ],\n" +
                        "    \"appTypeToValidate\": [\n" +
                        "        \"1\"\n" +
                        "    ],\n" +
                        "    \"testError\": false,\n" +
                        "    \"stopExecution\":false\n" +
                        "}";

        return caso;
    }
    public String CambioDePlanDePostpagoEmpresarial5_3APostpagoEmpresarial5_1(){
        fileCSV.readFile(path);
        url = fileCSV.data.get(8).get(1);
        user= fileCSV.data.get(8).get(2);
        password = fileCSV.data.get(8).get(3);
        msisdn = fileCSV.data.get(8).get(4);
        String caso=
                "{\n" +
                        "    \"contentFeature\": [\n" +
                        "        \"Feature: Cancelacion Roaming Linea Pospago 5.2\\n\\n Scenario Outline: Cancelacion Roaming Linea Pospago\\n Given Deseo navegar a la pagina <urlCrm>\\n And Ingreso el dato confidencial <userCrm> en el campo \\\"User\\\" sin captura\\n And Ingreso el dato confidencial <passCrm> en el campo \\\"Password\\\" sin captura\\n And Doy click en \\\"Submit\\\"\\n And Doy click en \\\"PostVenta\\\"\\n And Espero que la pagina cargue\\n And Selecciono en el arbol la opcion <opcTransacciones>\\n And Selecciono en el arbol la opcion <opcRoaming>\\n And Doy click en \\\"Cancelacion roaming\\\"\\n And Espero <tiempoEspera> segundos\\n And Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n And Cargo la pagina interna \\\"transaccion crm portal\\\"\\n When Ingreso rapidamente <msisdn> en el campo \\\"Numero\\\"\\n And Doy click en \\\"buscar\\\"\\n And Espero <tiempoEspera> segundos\\n And Doy click en \\\"cancelar roaming\\\"\\n And Doy click en \\\"aceptar\\\"\\n\\n Examples:\\n|urlCrm|userCrm|passCrm|opcTransacciones|opcRoaming|tiempoEspera|msisdn|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Transacciones\\\"|\\\"Roaming\\\"|\\\"5\\\"|\\\""+msisdn+"\\\"|\\n\"\n" +
                        "    ],\n" +
                        "    \"nameFeature\": [\n" +
                        "        \"ESC001_ Cancelacion Roaming Linea Pospago 5.2\"\n" +
                        "    ],\n" +
                        "    \"contentProperties\": [\n" +
                        "        \"|User=//*[@name='username']|Password=//*[@name='password']|Submit=//*[@class='login-button']|PostVenta=//div[@id='UINavigationPortlet']//a[contains(text(),'Postventa')]|Cancelacion roaming=(//a[@href='#'][contains(@id,'id17')][contains(.,'Cancelaci')])[6]|transaccion crm portal=//iframe|Numero=//*[@id='formBusqueda:inputMsisdn']|buscar=//*[@name='formBusqueda:j_id17']|cancelar roaming=//*[@id='formCancelacion:j_id32']|aceptar=//*[@class='botonAceptar']|\"\n" +
                        "    ],\n" +
                        "    \"allowsTrace\": \"0\",\n" +
                        "    \"browser\": \"chrome\",\n" +
                        "    \"aplicationType\": [\n" +
                        "        \"Web\",\n" +
                        "        \"Web\"\n" +
                        "    ],\n" +
                        "    \"aplication\": [\n" +
                        "        \"CRM\",\n" +
                        "        \"CRM\"\n" +
                        "    ],\n" +
                        "    \"process\": [\n" +
                        "        \" Cancelacion Roaming Linea Pospago\",\n" +
                        "        \" Activacion Control para cliente CC\"\n" +
                        "    ],\n" +
                        "    \"iterations\": [\n" +
                        "        1\n" +
                        "    ],\n" +
                        "    \"appTypeToValidate\": [\n" +
                        "        \"1\",\n" +
                        "        \"1\"\n" +
                        "    ],\n" +
                        "    \"testError\": false,\n" +
                        "    \"stopExecution\":false\n" +
                        "}";
        return caso;
    }
    public String RealizarActivacionDeRoamingLineaPostpago5_2(){
        fileCSV.readFile(path);
        url = fileCSV.data.get(9).get(1);
        user= fileCSV.data.get(9).get(2);
        password = fileCSV.data.get(9).get(3);
        msisdn = fileCSV.data.get(9).get(4);
        identificacion = fileCSV.data.get(9).get(8);

        String caso=
                "{\n" +
                "    \"contentFeature\": [\n" +
                "        \"Feature: Activar Roaming con vigencia y limite de consumo de datos\\n\\n  Scenario Outline: Activar Roaming con vigencia y limite de consumo de datos\\n   Given Deseo navegar a la pagina <urlCrm>\\n    And Ingreso rapidamente <userCrm> en el campo \\\"User\\\"\\n    And Ingreso rapidamente <passCrm> en el campo \\\"Password\\\"\\n    And Doy click en \\\"Submit\\\"\\n    And Doy click en \\\"PostVenta\\\"\\n    And Espero que la pagina cargue\\n    And Selecciono en el arbol la opcion <OpcTransacciones>\\n    And Selecciono en el arbol la opcion <OpcRoaming>\\n    And Doy click en \\\"activacion roaming\\\"\\n    And Espero <tiempoEspera> segundos\\n    And Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n    And Cargo la pagina interna \\\"transaccion crm portal\\\"\\n    And Ingreso rapidamente <msisdn> en el campo \\\"msisdnroaming\\\"\\n    And Doy click en \\\"boton buscar\\\"\\n    And Ingreso rapidamente <numeroDocumento> en el campo \\\"numero documento roaming\\\"\\n    And Selecciono <opcList> de la lista \\\"anio expedicion roaming\\\"\\n    And Ingreso el mes <mes> el ano <anhio> y el dia <dia>\\n    And Ingreso rapidamente <limite consumo> en el campo \\\"limite consumo\\\"\\n    And Selecciono <opcPaquete> de la lista \\\"paquete datos\\\"\\n    And Doy click en \\\"activar roaming\\\"\\n    And Doy click en \\\"aceptar roaming\\\"\\n\\n Examples:\\n|urlCrm|userCrm|passCrm|OpcTransacciones|OpcRoaming|tiempoEspera|msisdn|numeroDocumento|opcList|mes|anhio|dia|limite consumo|opcPaquete|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Transacciones\\\"|\\\"Roaming\\\"|\\\"3\\\"|\\\""+msisdn+"\\\"|\\\""+identificacion+"\\\"|\\\"2000\\\"|\\\"Oct\\\"|\\\"1988\\\"|\\\"17\\\"|\\\"9999\\\"|\\\"Paquete básico\\\"|\\n\"\n" +
                "    ],\n" +
                "    \"nameFeature\": [\n" +
                "        \"ESC001_ Activar Roaming con vigencia y limite de consumo de datos\"\n" +
                "    ],\n" +
                "    \"contentProperties\": [\n" +
                "        \"|User=id:username|Password=id:password|Submit=name:login|PostVenta=linkText:Postventa|activacion roaming=//a[contains(text(),'Activaci')]|transaccion crm portal=//iframe|msisdnroaming=//*[@id='formBusqueda:inputMsisdn']|boton buscar=//input[@class='botonEstandar']|numero documento roaming=id:formActivacion:numeroDocPostpago|anio expedicion roaming=//select[@id='formActivacion:selectAnioExpedicion']|limite consumo=id:formActivacion:inputLimConsumoDatos|paquete datos=//select[@id='formActivacion:selectPaquete']|activar roaming=id:botonAceptar|aceptar roaming=id:botonAceptar|\"\n" +
                "    ],\n" +
                "    \"allowsTrace\": \"0\",\n" +
                "    \"browser\": \"firefox\",\n" +
                "    \"aplicationType\": [\n" +
                "        \"Web\"\n" +
                "    ],\n" +
                "    \"aplication\": [\n" +
                "        \"CRM\"\n" +
                "    ],\n" +
                "    \"process\": [\n" +
                "        \" Activar Roaming con vigencia y limite de consumo de datos\"\n" +
                "    ],\n" +
                "    \"iterations\": [\n" +
                "        1\n" +
                "    ],\n" +
                "    \"appTypeToValidate\": [\n" +
                "        \"1\"\n" +
                "    ],\n" +
                "    \"testError\": false,\n" +
                "    \"stopejecution\": false\n" +
                "}";

        return caso;
    }
    public String CambioDePlanDePostpagoEmpresarial5_1APostpagoEmpresarial5_1Plus(){
        fileCSV.readFile(path);
        url = fileCSV.data.get(10).get(1);
        user= fileCSV.data.get(10).get(2);
        password = fileCSV.data.get(10).get(3);
        msisdn = fileCSV.data.get(10).get(4);
        nombreServidorPuerto = fileCSV.data.get(10).get(7);
        String caso=
                "{\n" +
                        "    \"contentFeature\": [\n" +
                        "        \"Feature: Cambio de Plan de Postpago Empresarial 5.1 a 1245-Pospago Negocios 5.1 Plus+-\\n\\n      Scenario Outline: Cambio de Plan de Postpago Empresarial\\n\\tGiven Deseo navegar a la pagina <urlCrm>\\n\\tAnd Ingreso rapidamente <userCrm> en el campo \\\"User\\\"\\n\\tAnd Ingreso rapidamente <passCrm> en el campo \\\"Password\\\"\\n\\tAnd Doy click en \\\"Submit\\\"\\n\\tAnd Doy click en \\\"PostVenta\\\"\\n\\tAnd Espero que la pagina cargue\\n\\tAnd Selecciono en el arbol la opcion <opcTransacciones>\\n\\tAnd Selecciono en el arbol la opcion <opcModificacionDeLinea>\\n\\tAnd Doy click en \\\"Cambio de plan Controles y Pospagos\\\"\\n\\tAnd Espero <tiempoEspera> segundos\\n\\tAnd Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n\\tAnd Cargo la pagina interna \\\"transaccion crm portal\\\"\\n\\tWhen Ingreso rapidamente <msisdn> en el campo \\\"Numero de Movil\\\"\\n    And Doy click en \\\"generateToken\\\"\\n    And Espero <Espera> segundos\\n    And Espero <Espera30> segundos\\n    And Doy click en \\\"generateToken\\\"\\n    And Espero <tiempo> segundos\\n    And En el ambiente <ipWithPort> obtengo el token para linea <msisdn> y lo ingreso en el campo \\\"asessorPass\\\"\\n    And Doy click en \\\"vble_mapeo\\\"\\n    And Espero <tiempo5> segundos\\n\\tAnd Ingreso rapidamente <motivo> en el campo \\\"Motivo del Cambio\\\"\\n\\tAnd Espero que el elemento \\\"loading box\\\" sea invisible\\n\\tAnd Selecciono <listaPlan> de la lista \\\"plan destino\\\"\\n\\tAnd Selecciono <contrato> de la lista \\\"renovacion contrato\\\"\\n\\tAnd Doy click en \\\"fecha calendario\\\"\\n\\tAnd Espero que el elemento \\\"loading box\\\" sea invisible\\n\\tAnd Doy click en \\\"boton cambiar plan\\\"\\n\\tThen Selecciono la opcion <alert> del mensaje de alerta\\n\\tAnd Espero que cargue completamente el documento de la pagina\\n\\tThen Verifico el mensaje <mensajeFinal> buscando en la lista \\\"resultados postventa\\\" y realizo scroll hasta el \\\"Resultado cambio\\\"\\n\\n Examples:\\n|urlCrm|userCrm|passCrm|opcTransacciones|opcModificacionDeLinea|tiempoEspera|msisdn|Espera|Espera30|tiempo|ipWithPort|tiempo5|motivo|listaPlan|contrato|alert|mensajeFinal|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Transacciones\\\"|\\\"Modificacion de Linea\\\"|\\\"5\\\"|\\\""+msisdn+"\\\"|\\\"40\\\"|\\\"40\\\"|\\\"5\\\"|\\\""+nombreServidorPuerto+"\\\"|\\\"5\\\"|\\\"Cambio de plan pospago a prepago\\\"|\\\"1245-Pospago Negocios 5.1 Plus+-\\\"|\\\"SI\\\"|\\\"Aceptar\\\"|\\\"-\\\"|\\n\"\n" +
                        "    ],\n" +
                        "    \"nameFeature\": [\n" +
                        "        \"ESC001_ Cambio de Plan de Postpago Empresarial 5.1 a 1245-Pospago Negocios 5.1 Plus+-\"\n" +
                        "    ],\n" +
                        "    \"contentProperties\": [\n" +
                        "        \"|User=id:username|Password=id:password|Submit=name:login|PostVenta=linkText:Postventa|Cambio de plan Controles y Pospagos=xpath://a[contains(text(),'Cambio de plan Controles y Pospagos')]|transaccion crm portal=id:iframe|Numero de Movil=id:PlanschangeForm:msisdnField:msisdn|generateToken=//input[@value=' Solicitar Clave ']|asessorPass=//input[@id='PlanschangeForm:j_id198:aseToken']|vble_mapeo=\\\"\\\"|Motivo del Cambio=id:PlanschangeForm:reasonField:reason|loading box=id:ajaxLoadingModalBoxCDiv|plan destino=id:PlanschangeForm:planField2|renovacion contrato=name:PlanschangeForm:InfoAnnualRenewal:decisionField|fecha calendario=id:PlanschangeForm:IdFechaCalendarizarInputDate|boton cambiar plan=id:PlanschangeForm:bntPlanChange|resultados postventa=//body//li[@class='infomsg']|Resultado cambio=xpath://body//li[%s]|\"\n" +
                        "    ],\n" +
                        "    \"allowsTrace\": \"0\",\n" +
                        "    \"browser\": \"firefox\",\n" +
                        "    \"aplicationType\": [\n" +
                        "        \"Web\"\n" +
                        "    ],\n" +
                        "    \"aplication\": [\n" +
                        "        \"CRM\"\n" +
                        "    ],\n" +
                        "    \"process\": [\n" +
                        "        \" Cambio de Pospago a Pospago Generico\"\n" +
                        "    ],\n" +
                        "    \"iterations\": [\n" +
                        "        1\n" +
                        "    ],\n" +
                        "    \"appTypeToValidate\": [\n" +
                        "        \"1\"\n" +
                        "    ],\n" +
                        "    \"testError\": false,\n" +
                        "    \"stopejecution\": false\n" +
                        "}";

        return caso;
    }
    public String CatalogoAtp_GestionCuentas_Suscripcion_Ejecucion(){
        fileCSV.readFile(path);
        url = fileCSV.data.get(11).get(1);
        user= fileCSV.data.get(11).get(2);
        password = fileCSV.data.get(11).get(3);
        msisdn = fileCSV.data.get(11).get(4);
        cedulavendedor = fileCSV.data.get(11).get(6);
        String caso=
                "{\n" +
                        "    \"contentFeature\": [\n" +
                        "        \"Feature: Gestionar cuentas ATP\\n\\n         Scenario Outline: Gestionar cuentas ATP\\n\\tGiven Deseo navegar a la pagina <urlCRM>\\n    And Ingreso rapidamente <userNameCRM> en el campo \\\"User\\\" sin captura\\n    And Ingreso rapidamente <passwordCRM> en el campo \\\"Password\\\" sin captura\\n    And Doy click en \\\"Submit\\\" sin captura\\n    And Doy click en \\\"Venta\\\"\\n    And Espero que la pagina cargue\\n    And Selecciono en el arbol la opcion <Activacion>\\n    And Selecciono en el arbol la opcion <ATP>\\n    And Doy click en \\\"gestionar Cuentas\\\"\\n    And Espero <tiempoEspera> segundos\\n    And Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n    And Cargo la pagina interna \\\"transaccion crm portal\\\"\\n    And Ingreso rapidamente <nitCliente> en el campo \\\"nit cuenta\\\"\\n    And Doy click en \\\"agregar cuenta\\\"\\n    And Espero <tiempoEspera> segundos\\n    And Ingreso rapidamente <nitCliente> en el campo \\\"Agregar Nit\\\" sin captura\\n    And Ingreso rapidamente <NombreEmpresa> en el campo \\\"Nombre Empresa\\\" sin captura\\n    And Ingreso rapidamente <NombreContactoEmpresa> en el campo \\\"Nombre Contacto Empresa\\\" sin captura\\n    And Ingreso rapidamente <TelefonoContactoEmpresa> en el campo \\\"Telefono Contacto Empresa\\\" sin captura\\n    And Ingreso rapidamente <emailcuenta> en el campo \\\"Email Cuenta\\\" sin captura\\n    And Ingreso rapidamente <NombreAsesorCuenta> en el campo \\\"NombreAsesorCuenta\\\" sin captura\\n    And Selecciono <CicloCuenta> de la lista \\\"Ciclo Cuenta\\\"\\n    And Cambio la descripcion del paso anterior por <datosDeCuenta>\\n    And Doy click en \\\"Guardar Nueva Cuenta\\\"\\n    And Doy click en \\\"Aceptar cuenta padre\\\" sin captura\\n    And Espero <tiempoEspera> segundos\\n    And Doy click en \\\"buscar Cuentas\\\"\\n    And Espero <tiempoEspera> segundos\\n    And Doy click en \\\"agregarcliente\\\"\\n    And Ingreso rapidamente <nomEmpresa> en el campo \\\"Nombre Empresa Cliente\\\"\\n    And Ingreso rapidamente <nomContacto> en el campo \\\"Nombre Contacto cliente\\\"\\n    And Doy click en \\\"guardarnuevacuentac\\\"\\n    And Doy click en \\\"aceptar nuevo cliente\\\"\\n     And Deseo navegar a la pagina <urlCRM>\\n    And Doy click en \\\"Venta\\\"\\n    And Espero que la pagina cargue\\n    And Doy click en \\\"Contratos\\\"\\n    And Espero <tiempoEspera> segundos\\n    And Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n    And Cargo la pagina interna \\\"transaccion crm portal\\\"\\n    And Selecciono <opcionBusqueda> de la lista \\\"opcionbusqueda\\\"\\n    And Ingreso rapidamente <nitCliente> en el campo \\\"campovalor\\\"\\n    And Doy click en \\\"buscarcontrato\\\"\\n    And Espero que el elemento \\\"loadingmodalboxc\\\" sea invisible\\n    And Doy click en \\\"nuevocontrato\\\"\\n    And Espero que el elemento \\\"loadingmodalboxc\\\" sea invisible\\n    And Doy click en \\\"botonlupa\\\"\\n    And Espero que el elemento \\\"loadingmodalboxc\\\" sea invisible\\n    And Modifico el atributo <atributo> del campo \\\"camponit\\\" por <nitCliente>\\n    And Presiono la tecla <tecla> en el campo \\\"camponit\\\"\\n    And Doy click en \\\"cargarnit\\\"\\n    And Espero que el elemento \\\"loadingmodalboxc\\\" sea invisible\\n    And Selecciono <vigenciaContrato> de la lista \\\"vigenciacontrato\\\"\\n    And Espero que el elemento \\\"loadingmodalboxc\\\" sea invisible\\n    And Selecciono <rangoContrato> de la lista \\\"rangocontrato\\\"\\n    And Selecciono <tipoContrato> de la lista \\\"tipocontrato\\\"\\n    And Doy click en \\\"guardarcontrato\\\"\\n    And Espero que el elemento \\\"loadingmodalboxc\\\" sea invisible\\n    And Doy click en \\\"aceptarcontrato\\\"\\n    And Espero que el elemento \\\"loadingmodalboxc\\\" sea invisible\\n    And Valido que valor del campo \\\"mensajefinal\\\" sea <mensajeFinal>\\n\\n Examples:\\n|urlCRM|userNameCRM|passwordCRM|Activacion|ATP|tiempoEspera|nitCliente|NombreEmpresa|NombreContactoEmpresa|TelefonoContactoEmpresa|emailcuenta|NombreAsesorCuenta|CicloCuenta|datosDeCuenta|nomEmpresa|nomContacto|opcionBusqueda|atributo|tecla|vigenciaContrato|rangoContrato|tipoContrato|mensajeFinal|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Activación\\\"|\\\"ATP Corporativo\\\"|\\\"5\\\"|\\\""+nit+"\\\"|\\\"Comercial Nutresa SAS\\\"|\\\"Comercial Nutresa\\\"|\\\"3335555\\\"|\\\"contacto@correo.com\\\"|\\\"Natalia\\\"|\\\"Default\\\"|\\\"Se ingresan los datos de la cuenta\\\"|\\\"Comercial Nutresa SAS\\\"|\\\"Comercial Nutresa\\\"|\\\"NIT\\\"|\\\"value\\\"|\\\"Tab\\\"|\\\"12\\\"|\\\"500,000.00 - 1,000,000.00\\\"|\\\"B2B\\\"|\\\"Se creo correctamente el contrato\\\"|\\n\",\n" +
                        "        \"Feature: Suscripción de catalogo ATP Corporativo\\n\\n   Scenario Outline: Suscripción de catalogo ATP Corporativo\\n\\tGiven Deseo navegar a la pagina <urlCRM>\\n    And Ingreso rapidamente <userNameCRM> en el campo \\\"User\\\"\\n    And Ingreso rapidamente <passwordCRM> en el campo \\\"Password\\\"\\n    And Doy click en \\\"Submit\\\"\\n    And Doy click en \\\"Venta\\\"\\n    And Espero que la pagina cargue\\n    And Selecciono en el arbol la opcion <Activacion>\\n    And Selecciono en el arbol la opcion <ATPCorporativo>\\n    And Doy click en \\\"Suscripcion de catalago\\\"\\n    And Espero <tiempoEspera> segundos\\n    And Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n    And Cargo la pagina interna \\\"transaccion crm portal\\\"\\n    And Selecciono <flitrocatalago> de la lista \\\"flitrocatalago\\\"\\n    And Ingreso rapidamente <busquedacatalogo> en el campo \\\"busquedacatalogo\\\"\\n    And Doy click en \\\"buscarcatalogo\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Modifico el atributo <atributo> del campo \\\"buscarcliente\\\" por <valorAtributoCliente>\\n    And Presiono la tecla <tecla> en el campo \\\"buscarcliente\\\"\\n    And Doy click en \\\"tablacuentacliente\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Doy click en \\\"agregarperfil\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Ingreso rapidamente <nombreperfil> en el campo \\\"nombreperfil\\\"\\n    And Ingreso rapidamente <descripcionperfil> en el campo \\\"descripcionperfil\\\"\\n    And Doy click en \\\"crearperfil\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Valido que valor del campo \\\"resultadocrearperfil\\\" sea <resultadocrearperfil>\\n    And Doy click en \\\"cerrarmodal\\\"\\n    And Modifico el atributo <atributo> del campo \\\"nombredelperfil\\\" por <nombreperfil>\\n    And Presiono la tecla <tecla> en el campo \\\"nombredelperfil\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Doy click en \\\"agregarservicio\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Selecciono <tiposervicio> de la lista \\\"tiposervicio\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    When Busco en la tabla \\\"tablaservicio\\\" el valor <servicio> por <mapType> partiendo de <inicioTabla> y doy click \\\"serviciobox\\\" cuando encuentro \\\"descripcionservicio\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Doy click en \\\"asociarservicio\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Valido que valor del campo \\\"resultadoservicio\\\" sea <resultadoservicio>\\n    And Doy click en \\\"cerrarmodalservicio\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Doy click en \\\"agregarlinea\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Selecciono <tipoasociarlinea> de la lista \\\"tipoasociarlinea\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Ingreso rapidamente <asociarlinea> en el campo \\\"asociarlinea\\\"\\n    And Doy click en \\\"botonvalidar\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Valido que valor del campo \\\"resultmsisdn\\\" sea <resultmsisdn>\\n    And Doy click en \\\"cerrarasociarlinea\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Doy click en \\\"guardarcatalogo\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Doy click en \\\"aceptaralerta\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Valido que valor del campo \\\"mensajecatalogo\\\" sea <mensajecatalogo>\\n\\n Examples:\\n|urlCRM|userNameCRM|passwordCRM|Activacion|ATPCorporativo|tiempoEspera|flitrocatalago|busquedacatalogo|atributo|valorAtributoCliente|tecla|nombreperfil|descripcionperfil|resultadocrearperfil|tiposervicio|servicio|mapType|inicioTabla|resultadoservicio|tipoasociarlinea|asociarlinea|resultmsisdn|mensajecatalogo|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Activación\\\"|\\\"ATP Corporativo\\\"|\\\"5\\\"|\\\"NIT\\\"|\\\""+nit+"\\\"|\\\"value\\\"|\\\"Comercial Nutresa SAS\\\"|\\\"tab\\\"|\\\"perfil\\\"|\\\"descripcion\\\"|\\\"Perfil se agrego con Exito..!\\\"|\\\"DATA\\\"|\\\"Voz y SMS Todo Destino infinitos + 20GB WA+Mail+Smart P3\\\"|\\\"id\\\"|\\\"0\\\"|\\\"Servicio Asociado Exitosamente.\\\"|\\\"Individual\\\"|\\\""+msisdn+"\\\"|\\\"El MSISDN: 3045981670,se ha asociado con Exito.\\\"|\\\"Catalogo Guardado Exitosamente\\\"|\\n\",\n" +
                        "        \"Feature: Ejecutar catalogo ATP Corporativo\\n\\n    Scenario Outline: Ejecutar catalogo ATP Corporativo\\n\\tGiven Deseo navegar a la pagina <urlCRM>\\n    And Ingreso rapidamente <userNameCRM> en el campo \\\"User\\\"\\n    And Ingreso rapidamente <passwordCRM> en el campo \\\"Password\\\"\\n    And Doy click en \\\"Submit\\\"\\n    And Doy click en \\\"Venta\\\"\\n    And Espero que la pagina cargue\\n    And Selecciono en el arbol la opcion <Activacion>\\n    And Selecciono en el arbol la opcion <ATPCorporativo>\\n    And Doy click en \\\"Suscripcion de catalago\\\"\\n    And Espero <tiempoEspera> segundos\\n    And Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n    And Cargo la pagina interna \\\"transaccion crm portal\\\"\\n    And Selecciono <flitrocatalago> de la lista \\\"flitrocatalago\\\"\\n    And Ingreso rapidamente <busquedacatalogo> en el campo \\\"busquedacatalogo\\\"\\n    And Doy click en \\\"buscarcatalogo\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    When Modifico el atributo <atributo> del campo \\\"buscarcliente\\\" por <valorAtributoCliente>\\n    And Presiono la tecla <tecla> en el campo \\\"buscarcliente\\\"\\n    And Doy click en \\\"tablacuentacliente\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Doy click en \\\"ejecutarcatalogo\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Ingreso rapidamente <idvendedorcatalago> en el campo \\\"idvendedorcatalago\\\"\\n    And Doy click en \\\"aceptarvendedor\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Doy click en \\\"aceptaralertaejecucion\\\"\\n    And Espero que el elemento \\\"loadingcatalogo\\\" sea invisible\\n    And Capturo con scroll la informacion completa de la pagina\\n    Then Verifico el mensaje <mensajeFinal> buscando en la lista \\\"resultados postventa\\\" y realizo scroll hasta el \\\"Resultado cambio\\\"\\n\\n Examples:\\n|urlCRM|userNameCRM|passwordCRM|Activacion|ATPCorporativo|tiempoEspera|flitrocatalago|busquedacatalogo|atributo|valorAtributoCliente|tecla|idvendedorcatalago|mensajeFinal|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Activación\\\"|\\\"ATP Corporativo\\\"|\\\"5\\\"|\\\"NIT\\\"|\\\""+nit+"\\\"|\\\"value\\\"|\\\"Comercial Nutresa SAS\\\"|\\\"tab\\\"|\\\""+cedulavendedor+"\\\"|\\\"\\\"|\\n\"\n" +
                        "    ],\n" +
                        "    \"nameFeature\": [\n" +
                        "        \"ESC001_ Gestionar cuentas ATP\",\n" +
                        "        \"ESC002_ Suscripción de catalogo ATP Corporativo\",\n" +
                        "        \"ESC003_ Ejecutar catalogo ATP Corporativo\"\n" +
                        "    ],\n" +
                        "    \"contentProperties\": [\n" +
                        "        \"|User=id:username|Password=id:password|Submit=name:login|Venta=linkText:Venta|gestionar Cuentas=linkText:Gestionar Cuentas|transaccion crm portal=id:iframe|nit cuenta=//input[@name='formBuscarCuenta:j_id24']|agregar cuenta=//input[@id='formBuscarCuenta:j_id26']|Agregar Nit=//input[@id='formAgregarCuenta:agregarNit']|Nombre Empresa=//input[@id='formAgregarCuenta:agregarNombre']|Nombre Contacto Empresa=//input[@id='formAgregarCuenta:addNombreContacto']|Telefono Contacto Empresa=//input[@id='formAgregarCuenta:addTelefonoContacto']|Email Cuenta=//input[@id='formAgregarCuenta:agregarEmail']|NombreAsesorCuenta=//input[@id='formAgregarCuenta:addNombreAsesor']|Ciclo Cuenta=//select[@id='formAgregarCuenta:addCiclo']|Guardar Nueva Cuenta=//input[@id='formAgregarCuenta:btnGuardarNuevaCuenta']|Aceptar cuenta padre=//input[@id='formConfAgregarCuenta:j_id175']|buscar Cuentas=//input[@id='formBuscarCuenta:j_id25']|agregarcliente=//input[@id='formCuentaResult:j_id68']|Nombre Empresa Cliente=//input[@id='formAgregarCliente:agregarNombre']|Nombre Contacto cliente=//input[@id='formAgregarCliente:addNombreContacto']|guardarnuevacuentac=//input[@id='formAgregarCliente:btnGuardarNuevaCuenta']|aceptar nuevo cliente=//input[@id='formConfAgregarCuenta:j_id175']|Contratos=linkText:Contratos|opcionbusqueda=id:formContract:formSearchContract:tipoFiltro|campovalor=id:formContract:formSearchContract:valorFiltro|buscarcontrato=id:formContract:formSearchContract:searchContractsButton|loadingmodalboxc=id:formContract:ajaxLoadingModalBoxC|nuevocontrato=id:formContract:formSearchContract:btnNuevoContrato|botonlupa=id:formContract:formNewContrato:searchAccount|camponit=name:formSearchAccount:j_id120:j_id127fsp|cargarnit=//a[@id='formSearchAccount:j_id120:0:downloadAccount']//img|vigenciacontrato=id:formContract:formNewContrato:idTypeDiscount|rangocontrato=id:formContract:formNewContrato:range|tipocontrato=id:formContract:formNewContrato:idTypeContract|guardarcontrato=id:formContract:formNewContrato:btnGuardar|aceptarcontrato=id:formNewContract:j_id148|mensajefinal=//span[contains(text(),'Se creo correctamente el contrato')]|\",\n" +
                        "        \"|User=id:username|Password=id:password|Submit=name:login|Venta=linkText:Venta|Suscripcion de catalago=//a[contains(text(),'Suscripci')]|transaccion crm portal=id:iframe|flitrocatalago=id:forCatalogo:tipoFiltro|busquedacatalogo=id:forCatalogo:nitEmpresa|buscarcatalogo=id:forCatalogo:j_id9|loadingcatalogo=id:forCatalogo:processPContainer|buscarcliente=name:forCatalogo:tablaCuenta:j_id19fsp|tablacuentacliente=id:forCatalogo:tablaCuenta:0:j_id19|agregarperfil=id:forCatalogo:j_id93|nombreperfil=id:forModalPerfil:nomPerfil|descripcionperfil=id:forModalPerfil:desPerfil|crearperfil=id:forModalPerfil:j_id130|resultadocrearperfil=//span[@id='forModalPerfil:resultModal']//ul[@class='message']|cerrarmodal=//img[@id='hidelink']|nombredelperfil=name:forCatalogo:tablaPerfil:j_id58fsp|agregarservicio=//a[@id='forCatalogo:tablaPerfil:0:addPlan']//img|tiposervicio=id:forModalAddPlan:selectCheckBoxService|tablaservicio=id:forModalAddPlan:tablaAddPlanes:n|serviciobox=id:forModalAddPlan:tablaAddPlanes:%s:chkFactura|descripcionservicio=id:forModalAddPlan:tablaAddPlanes:%s:j_id322|asociarservicio=id:forModalAddPlan:j_id330|resultadoservicio=//li[contains(text(),'Servicio Asociado Exitosamente.')]|cerrarmodalservicio=//img[@id='addPlan']|agregarlinea=//a[@id='forCatalogo:tablaPerfil:0:addMsisdn']//img|tipoasociarlinea=id:forModalAddLinea:tipoAsociacion|asociarlinea=id:forModalAddLinea:msisdn|botonvalidar=id:forModalAddLinea:j_id227|resultmsisdn=//*[@id=\\\"forModalAddLinea:resultModal\\\"]/ul|cerrarasociarlinea=//img[@id='addlink']|guardarcatalogo=id:forCatalogo:btnGuardarCat|aceptaralerta=id:forAlertG:j_id379|mensajecatalogo=//li[contains(text(),'Catalogo Guardado Exitosamente')]|\",\n" +
                        "        \"|User=id:username|Password=id:password|Submit=name:login|Venta=linkText:Venta|Suscripcion de catalago=//a[contains(text(),'Suscripci')]|transaccion crm portal=id:iframe|flitrocatalago=id:forCatalogo:tipoFiltro|busquedacatalogo=id:forCatalogo:nitEmpresa|buscarcatalogo=id:forCatalogo:j_id9|loadingcatalogo=id:forCatalogo:processPContainer|buscarcliente=name:forCatalogo:tablaCuenta:j_id19fsp|tablacuentacliente=id:forCatalogo:tablaCuenta:0:j_id19|ejecutarcatalogo=id:forCatalogo:btnEjecutarCat|idvendedorcatalago=id:forAlertEId:idVendedor|aceptarvendedor=id:forAlertEId:btnAceptarMdlVendor|aceptaralertaejecucion=id:forAlertEId:j_id400|resultados postventa=//body//li[@class='infomsg']|Resultado cambio=xpath://body//li[%s]|\"\n" +
                        "    ],\n" +
                        "    \"allowsTrace\": \"0\",\n" +
                        "    \"browser\": \"firefox\",\n" +
                        "    \"aplicationType\": [\n" +
                        "        \"Web\",\n" +
                        "        \"Web\",\n" +
                        "        \"Web\",\n" +
                        "        \"Web\"\n" +
                        "    ],\n" +
                        "    \"aplication\": [\n" +
                        "        \"CRM\",\n" +
                        "        \"CRM\",\n" +
                        "        \"CRM\",\n" +
                        "        \"CRM\"\n" +
                        "    ],\n" +
                        "    \"process\": [\n" +
                        "        \" Gestionar cuentas ATP\",\n" +
                        "        \" Suscripción de catalogo ATP Corporativo\",\n" +
                        "        \" Ejecutar catalogo ATP Corporativo\",\n" +
                        "        \" Contrato cliente ATP Corporativo\"\n" +
                        "    ],\n" +
                        "    \"iterations\": [\n" +
                        "        1,\n" +
                        "        1,\n" +
                        "        1\n" +
                        "    ],\n" +
                        "    \"appTypeToValidate\": [\n" +
                        "        \"1\",\n" +
                        "        \"1\",\n" +
                        "        \"1\",\n" +
                        "        \"1\"\n" +
                        "    ],\n" +
                        "    \"testError\": false,\n" +
                        "    \"stopejecution\": false\n" +
                        "}";
        return caso;
    }
    public String ConsultarLineaDetalles(String estadolinea){
        String consulta=
                "{\n" +
                        "    \"contentFeature\": [\n" +
                        "        \"Feature: Consultar Linea Detalles\\n\\n Scenario Outline: Consultar Linea Detalles\\n\\tGiven Deseo navegar a la pagina <urlCrm>\\n And Ingreso rapidamente <userCrm> en el campo \\\"User\\\" sin captura\\n And Ingreso rapidamente <passCrm> en el campo \\\"Password\\\" sin captura\\n And Doy click en \\\"Submit\\\" sin captura\\n And Espero que la pagina cargue\\n When Doy click en \\\"Consultas\\\"\\n And Espero que la pagina cargue\\n And Selecciono en el arbol la opcion <postventa>\\n And Selecciono en el arbol la opcion <integral>\\n And Doy click en \\\"Nueva pantalla unica\\\"\\n And Espero <tiempoEspera> segundos\\n And Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n And Cargo la pagina interna \\\"transaccion crm portal\\\"\\n And Ingreso rapidamente <msisdn> en el campo \\\"Msisdn\\\"\\n Then Doy click en \\\"Buscar\\\"\\n And Espero que la pagina cargue\\n And Valido que valor del campo \\\"estado linea\\\" sea <estadoLinea>\\n And Doy click en \\\"Detalles\\\"\\n And Espero <tiempoEsperaFinal> segundos\\n\\n Examples:\\n|urlCrm|userCrm|passCrm|postventa|integral|tiempoEspera|msisdn|estadoLinea|tiempoEsperaFinal|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Consulta Posventa\\\"|\\\"Consulta Integral\\\"|\\\"3\\\"|\\\""+msisdn+"\\\"|\\\""+estadolinea+"\\\"|\\\"5\\\"|\\n\"\n" +
                        "    ],\n" +
                        "    \"nameFeature\": [\n" +
                        "        \"ESC001_ Consultar Linea Detalles\"\n" +
                        "    ],\n" +
                        "    \"contentProperties\": [\n" +
                        "        \"|User=id:username|Password=id:password|Submit=name:login|Consultas=linkText:Consultas|Nueva pantalla unica=linkText:Nueva Pantalla Unica Clientes|transaccion crm portal=id:iframe|Msisdn=xpath://*[@id='j_id15:j_id26']|Buscar=//*[@id='j_id15:j_id27']|estado linea=//*[@id='j_id135:j_id187']|Detalles=id:j_id135:j_id188|\"\n" +
                        "    ],\n" +
                        "    \"allowsTrace\": \"0\",\n" +
                        "    \"browser\": \"firefox\",\n" +
                        "    \"aplicationType\": [\n" +
                        "        \"Web\"\n" +
                        "    ],\n" +
                        "    \"aplication\": [\n" +
                        "        \"CRM\"\n" +
                        "    ],\n" +
                        "    \"process\": [\n" +
                        "        \" Consultar Linea Detalles\"\n" +
                        "    ],\n" +
                        "    \"iterations\": [\n" +
                        "        1\n" +
                        "    ],\n" +
                        "    \"appTypeToValidate\": [\n" +
                        "        \"1\"\n" +
                        "    ],\n" +
                        "    \"testError\": false,\n" +
                        "    \"stopExecution\": false\n" +
                        "}";
        return  consulta;
    }



    public void ejecutar(){
        ExecuteServicesRestActions servicesRestActions = new ExecuteServicesRestActions();
        System.out.println(ReconexionRoboPerdidaEnLineaPortada());

    }



}
