package seedu.address.logic.commands;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.testutil.TypicalPersons.getTypicalEzFoodie;

import org.junit.jupiter.api.Test;

import seedu.address.model.EzFoodie;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

public class ClearCommandTest {

    @Test
    public void execute_emptyEzFoodie_success() {
        Model model = new ModelManager();
        Model expectedModel = new ModelManager();

        assertCommandSuccess(new ClearCommand(), model, ClearCommand.MESSAGE_SUCCESS, expectedModel);
    }

    @Test
    public void execute_nonEmptyEzFoodie_success() {
        Model model = new ModelManager(getTypicalEzFoodie(), new UserPrefs());
        Model expectedModel = new ModelManager(getTypicalEzFoodie(), new UserPrefs());
        expectedModel.setEzFoodie(new EzFoodie());

        assertCommandSuccess(new ClearCommand(), model, ClearCommand.MESSAGE_SUCCESS, expectedModel);
    }

}
