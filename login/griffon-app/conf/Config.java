/*
 * Copyright 2016-2018 Andres Almiray
 *
 * This file is part of Griffon Examples
 *
 * Griffon Examples is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Griffon Examples is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Griffon Examples. If not, see <http://www.gnu.org/licenses/>.
 */
import griffon.util.AbstractMapResourceBundle;
import org.kordamp.griffon.examples.login.LoginController;
import org.kordamp.griffon.examples.login.LoginModel;
import org.kordamp.griffon.examples.login.LoginView;
import org.kordamp.griffon.examples.login.SampleController;
import org.kordamp.griffon.examples.login.SampleModel;
import org.kordamp.griffon.examples.login.SampleView;

import javax.annotation.Nonnull;
import java.util.Map;

import static griffon.util.CollectionUtils.map;
import static java.util.Arrays.asList;

public class Config extends AbstractMapResourceBundle {
    @Override
    protected void initialize(@Nonnull Map<String, Object> entries) {
        map(entries)
            .e("application", map()
                .e("title", "Sample")
                .e("startupGroups", asList("login"))
                .e("autoShutdown", true)
            )
            .e("mvcGroups", map()
                .e("login", map()
                    .e("model", LoginModel.class.getName())
                    .e("view", LoginView.class.getName())
                    .e("controller", LoginController.class.getName())
                ).e("sample", map()
                    .e("model", SampleModel.class.getName())
                    .e("view", SampleView.class.getName())
                    .e("controller", SampleController.class.getName())
                )
            );
    }
}