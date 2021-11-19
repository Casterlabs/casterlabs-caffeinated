package co.casterlabs.caffeinated;

import co.casterlabs.caffeinated.ui.ApplicationUI;
import co.casterlabs.caffeinated.ui.UILifeCycleListener;
import lombok.SneakyThrows;
import xyz.e3ndr.fastloggingframework.FastLoggingFramework;
import xyz.e3ndr.fastloggingframework.logging.LogLevel;

public class Bootstrap {

    @SneakyThrows
    public static void main(String[] args) {
        FastLoggingFramework.setDefaultLevel(LogLevel.DEBUG);
        ApplicationUI.initialize(new UILifeCycleListener() {

            @Override
            public void onPreLoad() {

            }

            @Override
            public void onInitialLoad() {

            }

            @Override
            public boolean onCloseAttempt() {
                return true;
            }

            @Override
            public void onTrayMinimize() {

            }

        });

    }

}
