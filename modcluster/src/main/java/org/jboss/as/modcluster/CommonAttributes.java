/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.modcluster;

/**
 * @author Jean-Frederic Clere
 */
interface CommonAttributes {

    String MOD_CLUSTER_CONFIG = "mod-cluster-config";
    String LOAD_METRIC = "load-metric";
    String PROXY_CONF = "proxy-conf";
    String HTTPD_CONF = "httpd-conf";
    String NODES_CONF = "nodes-conf";
    String ADVERTISE_SOCKET = "advertise-socket";
    String SSL = "ssl";
    String PROXY_LIST = "proxy-list";
    String PROXY_URL = "proxy-url";
    String ADVERTISE = "advertise";
    String ADVERTISE_SECURITY_KEY = "advertise-security-key";
    String EXCLUDED_CONTEXTS = "excluded-contexts";
    String AUTO_ENABLE_CONTEXTS = "auto-enable-contexts";
    String STOP_CONTEXT_TIMEOUT = "stop-context-timeout";
    String SOCKET_TIMEOUT = "socket-timeout";
    String LOAD_METRIC_SIMPLE = "load-metric-simple";
    String LOAD_METRIC_SERVER_SIDE = "load-metric-server-side";
    String LOAD_METRIC_WEB_CONTAINER_SIDE = "load-metric-web-container-side";
    String LOAD_METRIC_OTHER = "load-metric-other";
    String FACTOR = "factor";
    String HISTORY = "history";
    String DECAY_FACTOR = "decay-factor";
    String NAME = "name";
    String CAPACITY = "capacity";
}