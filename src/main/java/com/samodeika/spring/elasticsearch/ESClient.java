package com.samodeika.spring.elasticsearch;

import org.elasticsearch.client.AdminClient;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ESClient {

    static final String HOSTNAME = "localhost";
    static final int PORTNUMBER = 9300;
    static final String CLUSTERNAME = "alex";

    private Client client;
    private AdminClient adminClient;

    public ESClient(String hostName, int portNumber, String clusterName) {
        try {
            Settings settings = Settings.settingsBuilder()
                    .put("cluster.name", clusterName).build();
            this.client = TransportClient.builder().settings(settings).build()
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(hostName), portNumber));
            adminClient = this.client.admin();
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public ESClient() {
        this(HOSTNAME, PORTNUMBER, CLUSTERNAME);
    }

    public Client getClient() {
        return client;
    }

    public AdminClient getAdminClient() {
        return adminClient;
    }
}
