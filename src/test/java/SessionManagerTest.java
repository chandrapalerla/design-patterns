import org.designpatterns.creational.singleton.InsufficientRightsException;
import org.designpatterns.creational.singleton.Session;
import org.designpatterns.creational.singleton.SessionManager;
import org.designpatterns.creational.singleton.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class SessionManagerTest {
    private SessionManager sessionManager;
    private User adminUser;
    private User regularUser;

    @BeforeEach
    public void setUp() {
        sessionManager = new SessionManager();
        adminUser = new User("admin", "admin");
        regularUser = new User("user", "user");
    }

    @Test
    public void testCreateSessionWithAdminAccess() {
        Session session = sessionManager.createSession(adminUser, "/admin/path");
        assertNotNull(session);
        assertEquals(adminUser, session.getUser());
    }

    @Test
    public void testCreateSessionWithoutAccess() {
        Executable executable = () -> sessionManager.createSession(regularUser, "/admin/path");
        assertThrows(InsufficientRightsException.class, executable);
    }

    @Test
    public void testCreateSessionWithValidPath() {
        Session session = sessionManager.createSession(adminUser, "/user/path");
        assertNotNull(session);
        assertEquals(adminUser, session.getUser());
    }
}
