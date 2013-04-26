/***************************************************************************
 * Copyright (c) 2012 VMware, Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * Get Fully Qualified Domain Name of this host
 *
 */

public class GetHostname {

    public static void main( String[] args ) throws UnknownHostException
    {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println( addr.getCanonicalHostName() );
        } catch (UnknownHostException e) {
            System.err.println("Caught UnknownHostException: " + e.getMessage());
        }
    }

}
