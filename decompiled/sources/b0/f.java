package b0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* loaded from: classes.dex */
public final class f extends AutofillManager$AutofillCallback {
    public static final f a = new f();

    public final void a(C0700a c0700a) {
        c0700a.f10903c.registerCallback(this);
    }

    public final void b(C0700a c0700a) {
        c0700a.f10903c.unregisterCallback(this);
    }

    public final void onAutofillEvent(View view, int i7, int i8) {
        super.onAutofillEvent(view, i7, i8);
        Log.d("Autofill Status", i8 != 1 ? i8 != 2 ? i8 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
