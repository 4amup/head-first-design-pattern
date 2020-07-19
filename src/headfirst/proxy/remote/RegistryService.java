package headfirst.proxy.remote;

import java.rmi.*;
import java.rmi.registry.*;

public class RegistryService {

	public static void main(String[] args) {
		try {
            // 本地主机上的远程对象注册表Registry的实例,默认端口1099
            Registry registry = LocateRegistry.createRegistry(1099);
            // 创建一个远程对象
            MyRemote service = new MyRemoteImpl();
            // 把远程对象注册到RMI注册服务器上，并命名为HelloRegistry
            registry.rebind("RemoteHello", service);
            System.out.println("======= 启动RMI服务成功! =======");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
	}

}
