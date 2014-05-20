package tid.pce.computingEngine.algorithms.multidomain;

import tid.pce.computingEngine.ComputingRequest;
import tid.pce.computingEngine.algorithms.ComputingAlgorithm;
import tid.pce.computingEngine.algorithms.ComputingAlgorithmPreComputation;
import tid.pce.computingEngine.algorithms.LocalChildRequestManager;
import tid.pce.computingEngine.algorithms.MDHPCEMinNumberDomainsAlgorithm;
import tid.pce.computingEngine.algorithms.ParentPCEComputingAlgorithmManager;
import tid.pce.computingEngine.algorithms.multiLayer.OperationsCounter;
import tid.pce.parentPCE.ChildPCERequestManager;
import tid.pce.parentPCE.ReachabilityManager;
import tid.pce.server.wson.ReservationManager;
import tid.pce.tedb.TEDB;

public class MinTransitDomainsInterLayerAlgorithmManager implements
ParentPCEComputingAlgorithmManager {

	private ChildPCERequestManager childPCERequestManager;
	private ReachabilityManager reachabilityManager;
	@Override
	public ComputingAlgorithm getComputingAlgorithm(
			ComputingRequest pathReq,
			TEDB ted) {
		MinTransitDomainsInterLayerAlgorithm sdwg=new MinTransitDomainsInterLayerAlgorithm(pathReq,ted,childPCERequestManager, reachabilityManager);
		return sdwg;
	}
	public ChildPCERequestManager getChildPCERequestManager() {
		return childPCERequestManager;
	}
	public void setChildPCERequestManager(
			ChildPCERequestManager childPCERequestManager) {
		this.childPCERequestManager = childPCERequestManager;
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
	@Override
	public void setLocalChildRequestManager(
			LocalChildRequestManager localChildRequestManager) {
		// TODO Auto-generated method stub
		
	}
	
}