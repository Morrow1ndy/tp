package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.reservation.Reservation;

/**
 * An UI component that displays information of a {@code Reservation}.
 */
public class ReservationCard extends UiPart<Region> {

    private static final String FXML = "ReservationListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */
    public final Reservation reservation;

    @FXML
    private HBox cardPane;
    @FXML
    private Label id;
    @FXML
    private Label dateTime;
    @FXML
    private Label remark;

    /**
     * Constructs a {@code ReservationCode} with the given {@code Reservation} to display.
     */
    public ReservationCard(Reservation reservation) {
        super(FXML);
        this.reservation = reservation;
        id.setText(reservation.getId().value);
        dateTime.setText(reservation.getDateTime().value);
        remark.setText(reservation.getRemark().value);
    }

    /**
     * Overrides the equals method.
     */
    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof ReservationCard)) {
            return false;
        }

        // state check
        ReservationCard card = (ReservationCard) other;
        return reservation.equals(card.reservation);
    }
}
