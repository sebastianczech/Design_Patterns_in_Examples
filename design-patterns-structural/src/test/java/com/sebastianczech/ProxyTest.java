package com.sebastianczech;

import com.sebastianczech.proxy.HttpProxy;
import com.sebastianczech.proxy.HttpResult;
import com.sebastianczech.proxy.HttpServer;
import com.sebastianczech.proxy.HttpServerApache;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProxyTest {

    @Test
    void should_download_file_from_http_server() {
        // given
        HttpServer httpServer = new HttpServerApache();
        HttpProxy httpProxy = new HttpProxy(httpServer);

        // when
        HttpResult result = httpProxy.downloadFile("filename.csv");

        // then
        assertThat(result).isNotNull();
        assertThat(result.getInfo()).isNotNull();
        assertThat(result.getInfo()).isEqualTo("[proxy header] [apache header] ");
    }

}
