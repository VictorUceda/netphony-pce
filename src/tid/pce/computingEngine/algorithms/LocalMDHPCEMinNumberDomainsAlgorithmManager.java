package tid.pce.computingEngine.algorithms;

import java.net.Inet4Address;
import java.util.concurrent.Callable;

import org.jgrapht.graph.DirectedWeightedMultigraph;

import tid.pce.computingEngine.ComputingRequest;
import tid.pce.computingEngine.ComputingResponse;
import tid.pce.computingEngine.algorithms.multiLayer.OperationsCounter;
import tid.pce.parentPCE.ChildPCERequestManager;
import tid.pce.parentPCE.ReachabilityManager;
import tid.pce.server.wson.ReservationManager;
import tid.pce.tedb.InterDomainEdge;
import tid.pce.tedb.TEDB;
/*
* @author baam
*/
public class LocalMDHPCEMinNumberDomainsAlgorithmManager implements
ParentPCEComputingAlgorithmManager {

	private LocalChildRequestManager localChildRequestManager;
	private ChildPCERequestManager childPCERequestManager;
	private ReachabilityManager reachabilityManager;
	@Override
	public ComputingAlgorithm getComputingAlgorithm(
			ComputingRequest pathReq,
			TEDB ted) {
		LocalMDHPCEMinNumberDomainsAlgorithm sdwg=new LocalMDHPCEMinNumberDomainsAlgorithm(pathReq,ted, childPCERequestManager , localChildRequestManager, reachabilityManager);
		return sdwg;
	}
	public ReachabilityManager getReachabilityManager() {
		return reachabilityManager;
	}
	public void setReachabilityManager(ReachabilityManager reachabilityManager) {
		this.reachabilityManager = reachabilityManager;
	}
	@Override
	public void setReservationManager(ReservationManager reservationManager) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPreComputation(ComputingAlgorithmPreComputation pc) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ComputingAlgorithm getComputingAlgorithm(ComputingRequest pathReq,
			TEDB ted, OperationsCounter OPcounter) {
		// TODO Auto-generated method stub
		return null;
	}
	public LocalChildRequestManager getLocalChildRequestManager() {
		return localChildRequestManager;
	}
	@Override
	public void setLocalChildRequestManager(
			LocalChildRequestManager localChildRequestManager) {
		this.localChildRequestManager = localChildRequestManager;
	}
	public ChildPCERequestManager getChildPCERequestManager() {
		return childPCERequestManager;
	}
	public void setChildPCERequestManager(
			ChildPCERequestManager childPCERequestManager) {
		this.childPCERequestManager = childPCERequestManager;
	}

}