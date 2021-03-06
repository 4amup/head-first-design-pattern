package headfirst.proxy.remote;

import java.rmi.*;
import java.rmi.server.*;

@SuppressWarnings("serial")
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	public String sayHello() throws RemoteException {
		return "Server says, 'Hey'";
	}

	public MyRemoteImpl() throws RemoteException {
	};

	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
