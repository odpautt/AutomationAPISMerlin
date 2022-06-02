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
    public String RealizarCesionDeContratoConNitANit_MigracionDePlanAUnPostpagoEmpresarial5_3(){
        fileCSV.readFile(path);
        url = fileCSV.data.get(4).get(1);
        user= fileCSV.data.get(4).get(2);
        password = fileCSV.data.get(4).get(3);
        msisdn = fileCSV.data.get(4).get(4);
        nit= fileCSV.data.get(4).get(5);
        cedulavendedor= fileCSV.data.get(4).get(5);

        String caso =
                "{\n" +
                        "    \"contentFeature\": [\n" +
                        "        \"Feature: Migracion de plan a un Postpago Empresarial 5.3 Contrato con Nit a Nit\\n\\n    Scenario Outline: Migracion de plan a un Postpago Empresarial 5.3 Contrato con Nit a Nit\\n\\tGiven Deseo navegar a la pagina <urlCrm>\\n\\tAnd Ingreso rapidamente <userCrm> en el campo \\\"User\\\"\\n\\tAnd Ingreso rapidamente <passCrm> en el campo \\\"Password\\\"\\n\\tAnd Doy click en \\\"Submit\\\"\\n\\tAnd Doy click en \\\"PostVenta\\\"\\n\\tAnd Espero que la pagina cargue\\n\\tAnd Selecciono en el arbol la opcion <opcTransacciones>\\n\\tAnd Selecciono en el arbol la opcion <opcModificacionDeLinea>\\n\\tAnd Doy click en \\\"Cesion de Contrato\\\"\\n\\tAnd Espero <tiempoEspera> segundos\\n\\tAnd Espero que el iFrame \\\"transaccion crm portal\\\" cargue\\n\\tAnd Cargo la pagina interna \\\"transaccion crm portal\\\"\\n\\tWhen Ingreso rapidamente <msisdn> en el campo \\\"msisdn cesion\\\"\\n\\tAnd Doy click en \\\"renovar contrato\\\"\\n\\tAnd Selecciono <identificacionCliente> de la lista \\\"identificacion cliente\\\"\\n\\tAnd Ingreso rapidamente <numeroId> en el campo \\\"numero de identificacion\\\"\\n\\tAnd Doy click en \\\"consultar id\\\"\\n\\tAnd Ingreso rapidamente <idVendedor> en el campo \\\"cedula vendedor cesion\\\"\\n\\tAnd Ingreso rapidamente <motivo> en el campo \\\"motivo del cambio contrato\\\"\\n\\tAnd Ingreso rapidamente <observacion> en el campo \\\"observacion cesion\\\"\\n\\tAnd Ingreso rapidamente <nombres> en el campo \\\"nombre cesion\\\"\\n\\tAnd Ingreso rapidamente <apellidos> en el campo \\\"apellido cesion\\\"\\n\\tAnd Selecciono <departamento> de la lista \\\"departamento cesion\\\"\\n\\tAnd Selecciono <ciudad> de la lista \\\"ciudad cesion\\\"\\n\\tAnd Doy click en \\\"direccion cesion\\\"\\n\\tAnd Selecciono <via> de la lista \\\"via direccion\\\"\\n\\tAnd Ingreso rapidamente <numeroDireccion> en el campo \\\"numero direccion\\\"\\n\\tAnd Selecciono <letra> de la lista \\\"letra\\\"\\n\\tAnd Selecciono <sufijo> de la lista \\\"sufijo\\\"\\n\\tAnd Doy click en \\\"sur\\\"\\n\\tAnd Ingreso rapidamente <placa> en el campo \\\"placa\\\"\\n\\tAnd Selecciono <letraPlaca> de la lista \\\"letraplaca\\\"\\n\\tAnd Selecciono <sufijoPlaca> de la lista \\\"sufijo placa\\\"\\n\\tAnd Doy click en \\\"sur placa\\\"\\n\\tAnd Ingreso rapidamente <con> en el campo \\\"con\\\"\\n\\tAnd Ingreso rapidamente <tipoVivienda> en el campo \\\"tipo vivienda\\\"\\n\\tAnd Ingreso rapidamente <numeroVivienda> en el campo \\\"numero vivienda\\\"\\n\\tAnd Ingreso rapidamente <indicacionesEspeciales> en el campo \\\"indicaciones especiales\\\"\\n\\tAnd Doy click en \\\"aceptar direccion\\\"\\n\\tAnd Ingreso rapidamente <emailCesion> en el campo \\\"email cesion\\\"\\n\\tAnd Selecciono <planCesion> de la lista \\\"plancesion\\\"\\n\\tAnd Selecciono <renovarContrato> de la lista \\\"renovar contrato\\\"\\n    And Muevo el scroll para llegar a \\\"vble_mapeo\\\"\\n    And Espero que el elemento \\\"vble_mapeo1\\\" este presente\\n\\tAnd Doy click en \\\"cambiar contrato\\\"\\n    And Espero <vble_datapoolAlert> segundos\\n\\tAnd Selecciono la opcion <alert> del mensaje de alerta\\n    Then Espero <vble_datapool> segundos\\n\\n Examples:\\n|urlCrm|userCrm|passCrm|opcTransacciones|opcModificacionDeLinea|tiempoEspera|msisdn|identificacionCliente|numeroId|idVendedor|motivo|observacion|nombres|apellidos|departamento|ciudad|via|numeroDireccion|letra|sufijo|placa|letraPlaca|sufijoPlaca|con|tipoVivienda|numeroVivienda|indicacionesEspeciales|emailCesion|planCesion|renovarContrato|vble_datapoolAlert|alert|vble_datapool|\\n|\\\""+url+"\\\"|\\\""+user+"\\\"|\\\""+password+"\\\"|\\\"Transacciones\\\"|\\\"Modificacion de Linea\\\"|\\\"4\\\"|\\\""+msisdn+"\\\"|\\\"NIT\\\"|\\\""+nit+"\\\"|\\\""+cedulavendedor+"\\\"|\\\"Cambio\\\"|\\\"N/A\\\"|\\\"Comercial \\\"|\\\"Nutresa \\\"|\\\"Antioquia\\\"|\\\"RIONEGRO\\\"|\\\"Calle\\\"|\\\"22\\\"|\\\"A\\\"|\\\"A\\\"|\\\"55\\\"|\\\"E\\\"|\\\"E\\\"|\\\"Carrera 22\\\"|\\\"Edificio \\\"|\\\"Apto\\\"|\\\"Alpes\\\"|\\\"correo@gmail.com\\\"|\\\"1210-Pospago 5.3 Empresarial-\\\"|\\\"SI\\\"|\\\"15\\\"|\\\"Aceptar\\\"|\\\"10\\\"|\\n\"\n" +
                        "    ],\n" +
                        "    \"nameFeature\": [\n" +
                        "        \"ESC001_ Migracion de plan a un Postpago Empresarial 5.3 Contrato con Nit a Nit\"\n" +
                        "    ],\n" +
                        "    \"contentProperties\": [\n" +
                        "        \"|User=id:username|Password=id:password|Submit=name:login|PostVenta=linkText:Postventa|Cesion de Contrato=linkText:Cesion de Contrato|transaccion crm portal=id:iframe|msisdn cesion=id:cesionContratoForm:msisdnField:msisdn|renovar contrato=id:cesionContratoForm:InfoAnnualRenewal:planField|identificacion cliente=id:cesionContratoForm:newIdField:newSubIdType|numero de identificacion=id:cesionContratoForm:newIdField:newSubId|consultar id=id:cesionContratoForm:newIdField:consultar|cedula vendedor cesion=id:cesionContratoForm:vendedorField:vendedor|motivo del cambio contrato=id:cesionContratoForm:motivoField:motivo|observacion cesion=id:cesionContratoForm:observacionField:observacion|nombre cesion=id:cesionContratoForm:nombreField:nombre|apellido cesion=id:cesionContratoForm:apellidoField:apellido|departamento cesion=name:cesionContratoForm:deptoField:j_id202|ciudad cesion=name:cesionContratoForm:ciudadField:j_id216|direccion cesion=id:cesionContratoForm:direccionField:direccion|via direccion=//select[contains(@class,'way_address')]|numero direccion=//input[contains(@class,'number_1_address_ui')]|letra=//select[contains(@class,'letter_1_address_ui_')]|sufijo=//select[contains(@class,'suffix_1_address_ui_')]|sur=//input[contains(@class,'south_1_address_ui_')]|placa=//input[contains(@class,'number_2_address_ui_')]|letraplaca=//select[contains(@class,'letter_2_address_ui_')]|sufijo placa=//select[contains(@class,'suffix_2_address_ui_')]|sur placa=//input[contains(@class,'south_2_address_ui_')]|con=//input[contains(@class,'with_address_ui_')]|tipo vivienda=//input[contains(@class,'tigo_address_additional_field tigo_address_set_building_unity_')]|numero vivienda=//input[contains(@class,'tigo_address_additional_field tigo_address_number_apartment_')]|indicaciones especiales=//input[contains(@class,'tigo_address_special_field tigo_address_special_address_ui')]|aceptar direccion=xpath://div[@class='tigo_address_content_button']|email cesion=id:cesionContratoForm:correoField:correo|plancesion=name:cesionContratoForm:j_id256|vble_mapeo=//*[@id='cesionContratoForm:bntPlanChange']|vble_mapeo1=//*[@id='cesionContratoForm:bntPlanChange']|cambiar contrato=//*[@id='cesionContratoForm:bntPlanChange']|\"\n" +
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
                        "        \" Migracion de plan a un Postpago Empresarial 5.3 Contrato con Nit a Nit\"\n" +
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
    public String CambioDePospagoAPospagoGenerico(){
        fileCSV.readFile(path);
        url = fileCSV.data.get(5).get(1);
        user= fileCSV.data.get(5).get(2);
        password = fileCSV.data.get(5).get(3);
        msisdn = fileCSV.data.get(5).get(4);

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
        url = fileCSV.data.get(6).get(1);
        user= fileCSV.data.get(6).get(2);
        password = fileCSV.data.get(6).get(3);
        msisdn = fileCSV.data.get(6).get(4);
        imsi= fileCSV.data.get(6).get(7);

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
        url = fileCSV.data.get(7).get(1);
        user= fileCSV.data.get(7).get(2);
        password = fileCSV.data.get(7).get(3);
        msisdn = fileCSV.data.get(7).get(4);


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
        url = fileCSV.data.get(8).get(1);
        user= fileCSV.data.get(8).get(2);
        password = fileCSV.data.get(8).get(3);
        msisdn = fileCSV.data.get(8).get(4);

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
        url = fileCSV.data.get(9).get(1);
        user= fileCSV.data.get(9).get(2);
        password = fileCSV.data.get(9).get(3);
        msisdn = fileCSV.data.get(9).get(4);
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
