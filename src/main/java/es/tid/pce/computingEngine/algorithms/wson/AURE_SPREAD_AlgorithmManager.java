package es.tid.pce.computingEngine.algorithms.wson;

import es.tid.pce.computingEngine.ComputingRequest;
import es.tid.pce.computingEngine.algorithms.ComputingAlgorithm;
import es.tid.pce.computingEngine.algorithms.ComputingAlgorithmManager;
import es.tid.pce.computingEngine.algorithms.ComputingAlgorithmPreComputation;
import es.tid.pce.computingEngine.algorithms.multiLayer.OperationsCounter;
import es.tid.pce.server.wson.ReservationManager;
import es.tid.tedb.TEDB;

public class AURE_SPREAD_AlgorithmManager implements ComputingAlgorithmManager{
	
	AURE_SPREAD_AlgorithmPreComputation preComp;
	
	private ReservationManager reservationManager;
	
	public ComputingAlgorithm getComputingAlgorithm(
			ComputingRequest pathReq, TEDB ted) {
		AURE_SPREAD_Algorithm algo = new AURE_SPREAD_Algorithm(pathReq, ted,reservationManager);
		algo.setPreComp(preComp);		
		return algo;
	}

	public void setReservationManager(ReservationManager reservationManager) {
		this.reservationManager=reservationManager;
		
	}

	public void setPreComputation(ComputingAlgorithmPreComputation pc) {
		// TODO Auto-generated method stub
		this.preComp=(AURE_SPREAD_AlgorithmPreComputation) pc;		
	
	}

	@Override
	public ComputingAlgorithm getComputingAlgorithm(ComputingRequest pathReq,
			TEDB ted, OperationsCounter OPcounter) {
		// TODO Auto-generated method stub
		return null;
	}

}
