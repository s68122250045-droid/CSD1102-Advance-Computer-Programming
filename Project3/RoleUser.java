public enum RoleUser {
    PublicRelation("Public Relation"),
    Division("Division"),
    Manager("Manager");

    private final String roleUser;

    private RoleUser(String roleUser) {
        this.roleUser = roleUser;
    }

    public String getRoleUser() {
        return roleUser;
    }
}