package tid.pce.tedb;

import java.net.Inet4Address;

public interface MultiDomainTEDB extends TEDB {

	public void addInterdomainLink( Object localDomainID, Object localRouterASBR, long localRouterASBRIf, Object remoteDomainID, Object remoteRouterASBR, long remoteRouterASBRIf, TE_Information te_info );
	
}