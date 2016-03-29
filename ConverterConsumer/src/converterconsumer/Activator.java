package converterconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.training.iface.ConsumerService;




//import com.training.ifaces.ConsumerService;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Consumer Started");
		
		ServiceReference<?> service = context.getServiceReference(ConsumerService.class);
		ConsumerService serv =(ConsumerService) context.getService(service);
		System.out.println("Conversion : " +serv.dollarToRupees(100));
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Consumer Stopped");
	}

}
