package Interface;

import com.mycompany.dto.UsuarioDTO;
import java.util.List;

/**
 *
 * @author Valeria
 */
public interface IUsuarioDAO {

    public UsuarioDTO obtenerUsuario(UsuarioDTO usuarioDTO);

    public List<UsuarioDTO> getUsuariosRegistrados();
}
