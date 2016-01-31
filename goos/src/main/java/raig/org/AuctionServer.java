package raig.org;

public interface AuctionServer {
    void startSellingItem();

    void hasReceivedJoinRequestFromSniper();

    void announceClosed();

    void stop();
}
