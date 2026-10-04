package N0;

import C2.C0034g;
import H0.H;
import P3.F;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import io.ktor.util.GzipHeaderFlags;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s implements InputConnection {
    public final C0034g a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6886b;

    /* renamed from: c, reason: collision with root package name */
    public int f6887c;

    /* renamed from: d, reason: collision with root package name */
    public w f6888d;

    /* renamed from: e, reason: collision with root package name */
    public int f6889e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6890f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6891g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f6892h = true;

    public s(w wVar, C0034g c0034g, boolean z7) {
        this.a = c0034g;
        this.f6886b = z7;
        this.f6888d = wVar;
    }

    public final void a(i iVar) {
        this.f6887c++;
        try {
            this.f6891g.add(iVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [e4.k, kotlin.jvm.internal.m] */
    public final boolean b() {
        int i7 = this.f6887c - 1;
        this.f6887c = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f6891g;
            if (!arrayList.isEmpty()) {
                ((z) this.a.f741l).f6907e.invoke(P3.q.U0(arrayList));
                arrayList.clear();
            }
        }
        return this.f6887c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z7 = this.f6892h;
        if (!z7) {
            return z7;
        }
        this.f6887c++;
        return true;
    }

    public final void c(int i7) {
        sendKeyEvent(new KeyEvent(0, i7));
        sendKeyEvent(new KeyEvent(1, i7));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        boolean z7 = this.f6892h;
        if (z7) {
            return false;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f6891g.clear();
        this.f6887c = 0;
        this.f6892h = false;
        z zVar = (z) this.a.f741l;
        int size = zVar.f6911i.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList = zVar.f6911i;
            if (kotlin.jvm.internal.l.a(((WeakReference) arrayList.get(i7)).get(), this)) {
                arrayList.remove(i7);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z7 = this.f6892h;
        if (z7) {
            return false;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        boolean z7 = this.f6892h;
        if (z7) {
            return false;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z7 = this.f6892h;
        return z7 ? this.f6886b : z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        boolean z7 = this.f6892h;
        if (z7) {
            a(new C0476a(String.valueOf(charSequence), i7));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        boolean z7 = this.f6892h;
        if (!z7) {
            return z7;
        }
        a(new g(i7, i8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        boolean z7 = this.f6892h;
        if (!z7) {
            return z7;
        }
        a(new h(i7, i8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z7 = this.f6892h;
        if (!z7) {
            return z7;
        }
        a(new j());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        w wVar = this.f6888d;
        return TextUtils.getCapsMode(wVar.a.a, H.e(wVar.f6896b), i7);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z7 = (i7 & 1) != 0;
        this.f6890f = z7;
        if (z7) {
            this.f6889e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return z1.c.M(this.f6888d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        if (H.b(this.f6888d.f6896b)) {
            return null;
        }
        return F.B(this.f6888d).a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i8) {
        return F.C(this.f6888d, i7).a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i8) {
        return F.D(this.f6888d, i7).a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        boolean z7 = this.f6892h;
        if (z7) {
            z7 = false;
            switch (i7) {
                case R.id.selectAll:
                    a(new v(0, this.f6888d.a.a.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z7;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i7) {
        int i8;
        boolean z7 = this.f6892h;
        if (z7) {
            z7 = true;
            if (i7 != 0) {
                switch (i7) {
                    case 2:
                        i8 = 2;
                        break;
                    case 3:
                        i8 = 3;
                        break;
                    case GzipHeaderFlags.EXTRA /* 4 */:
                        i8 = 4;
                        break;
                    case 5:
                        i8 = 6;
                        break;
                    case 6:
                        i8 = 7;
                        break;
                    case 7:
                        i8 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i7);
                        i8 = 1;
                        break;
                }
                ((z) this.a.f741l).f6908f.invoke(new k(i8));
            } else {
                i8 = 1;
                ((z) this.a.f741l).f6908f.invoke(new k(i8));
            }
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z7 = this.f6892h;
        if (z7) {
            return true;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z7) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i7) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10 = this.f6892h;
        if (!z10) {
            return z10;
        }
        boolean z11 = false;
        boolean z12 = (i7 & 1) != 0;
        boolean z13 = (i7 & 2) != 0;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            z7 = (i7 & 16) != 0;
            z8 = (i7 & 8) != 0;
            boolean z14 = (i7 & 4) != 0;
            if (i8 >= 34 && (i7 & 32) != 0) {
                z11 = true;
            }
            if (z7 || z8 || z14 || z11) {
                z9 = z11;
                z11 = z14;
            } else if (i8 >= 34) {
                z9 = true;
                z11 = true;
                z7 = true;
                z8 = true;
            } else {
                z7 = true;
                z8 = true;
                z9 = z11;
                z11 = true;
            }
        } else {
            z7 = true;
            z8 = true;
            z9 = false;
        }
        e eVar = ((z) this.a.f741l).f6914l;
        synchronized (eVar.f6861c) {
            try {
                eVar.f6864f = z7;
                eVar.f6865g = z8;
                eVar.f6866h = z11;
                eVar.f6867i = z9;
                if (z12) {
                    eVar.f6863e = true;
                    if (eVar.f6868j != null) {
                        eVar.a();
                    }
                }
                eVar.f6862d = z13;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [O3.i, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z7 = this.f6892h;
        if (!z7) {
            return z7;
        }
        ((BaseInputConnection) ((z) this.a.f741l).f6912j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i8) {
        boolean z7 = this.f6892h;
        if (z7) {
            a(new t(i7, i8));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        boolean z7 = this.f6892h;
        if (z7) {
            a(new u(String.valueOf(charSequence), i7));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        boolean z7 = this.f6892h;
        if (!z7) {
            return z7;
        }
        a(new v(i7, i8));
        return true;
    }
}
