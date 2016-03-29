package consumerservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.training.iface.ConsumerService;
import com.training.impl.ConsumerServiceImpl;

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
		
		this.registryConverterService();
	
		System.out.println("Service started");
		
	
	}
	
	private void registryConverterService(){
		ConsumerService service = new ConsumerServiceImpl();
		context.registerService(ConsumerService.class, service, null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Service stopped");
	}

}
