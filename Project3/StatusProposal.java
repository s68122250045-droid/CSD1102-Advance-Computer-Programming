public enum StatusProposal {
    Waiting("Waiting"),
    Rejectede("Rejected"),
    Approved("Approved");
    private final String statusProposal;
    private StatusProposal(String statusProposal) {
        this.statusProposal = statusProposal;
    }
    public String getStatusProposal() {
        return statusProposal;
    }
}