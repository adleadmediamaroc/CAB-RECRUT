package projet.pfe.tms.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import projet.pfe.tms.models.Permissions;
import projet.pfe.tms.services.impl.RolepermissionServiceImp;

import java.util.List;

@Configuration
public class MyConfiguration {
    @Bean
    public PermissionService permissionService() {
        return new PermissionService() {
            @Override
            public Permissions createPermission(Permissions permission) {
                return null;
            }

            @Override
            public Permissions getPermissionById(Long id) {
                return null;
            }

            @Override
            public List<Permissions> lire() {
                return null;
            }

            @Override
            public Permissions updatePermission(Long id, Permissions permission) {
                return null;
            }

            @Override
            public void deletePermission(Long id) {

            }
        };
    }
}
