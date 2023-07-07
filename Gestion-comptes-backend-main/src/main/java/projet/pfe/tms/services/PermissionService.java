package projet.pfe.tms.services;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import projet.pfe.tms.models.Permissions;

public interface PermissionService {
	    
	   	Permissions createPermission(Permissions permission);
	    
	    Permissions getPermissionById(Long id);
	    
	    List<Permissions> lire();
	    
	    Permissions updatePermission(Long id, Permissions permission);
	    
	    void deletePermission(Long id);
}
