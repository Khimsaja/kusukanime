package N0;

import F.E;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import o.C1622t;

/* loaded from: classes.dex */
public class m implements InputConnection {
    public final C1622t a;

    /* renamed from: b, reason: collision with root package name */
    public E f6885b;

    public m(E e7, C1622t c1622t) {
        this.a = c1622t;
        this.f6885b = e7;
    }

    public final void a(E e7) {
        e7.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.clearMetaKeyStates(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        E e7 = this.f6885b;
        if (e7 != null) {
            if (e7 != null) {
                a(e7);
                this.f6885b = null;
            }
            this.a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.commitText(charSequence, i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.deleteSurroundingText(i7, i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.deleteSurroundingTextInCodePoints(i7, i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.getCursorCapsMode(i7);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.getExtractedText(extractedTextRequest, i7);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.getSelectedText(i7);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i8) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.getTextAfterCursor(i7, i8);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i8) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.getTextBeforeCursor(i7, i8);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.performContextMenuAction(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i7) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.performEditorAction(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z7) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i7) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.requestCursorUpdates(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i8) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.setComposingRegion(i7, i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.setComposingText(charSequence, i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        E e7 = this.f6885b;
        if (e7 != null) {
            return e7.setSelection(i7, i8);
        }
        return false;
    }
}
